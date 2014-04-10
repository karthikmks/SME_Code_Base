package com.junit.com.bfp.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.bfp.valueobjects.UIComponentDetail;
import com.bfp.valueobjects.UIComponentMapping;

import net.sf.jxls.reader.ReaderBuilder;
import net.sf.jxls.reader.XLSReader;

/**
 * @author tiruppathir
 *
 */
public class TestDatabaseAccess {

	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); //Load Driver
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loan_management_v2" ,"root", "admin"); //Create Connection with Data Source Name : HOD_DATA
			
			//loadTable(con);
			
			
			Statement s = con.createStatement(); // Create Statement
			String query = "select ui_component_details_id,label from ui_component_details where ui_component_type='ATTACHMENT'"; // Create Query
			s.execute(query); // Execute Query
			System.out.println("Executing Query...");
			ResultSet rs = s.getResultSet(); //return the data from Statement into ResultSet
			System.out.println("Query Executed..");
			while(rs.next()) // Retrieve data from ResultSet
			{
				Statement stmt = con.createStatement(); 
				System.out.print("Employee Id : "+rs.getString(2)); //1st column of Table from database
				String docNAme = rs.getString(2).trim().replace(" ", "_");
				String query2 = "update ui_component_details set doc_name='"+docNAme+"' where ui_component_details_id="+rs.getInt(1); 
				System.out.println(stmt.execute(query2));
			}
			s.close();
			con.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception : "+e);
		}
	}
	

@SuppressWarnings("unchecked")
	private static void loadTable(Connection conn) throws Exception{
		UIComponentMapping screenComponentData = new UIComponentMapping();
		Map beans = new HashMap();
		beans.put("screenComponentData", screenComponentData);        
		
		InputStream inputXML = 
			new FileInputStream(
					new File("C:\\Karthik\\SME\\SampleApps\\TABLE_MAPPING.xml"));
		XLSReader mainReader = ReaderBuilder.buildFromXML( inputXML );
		
        InputStream inputXLS = //clear columns having value as 'delete' 
        	new FileInputStream(new File("C:\\Users\\User1\\Downloads\\Book1.xls"));
      //Method 1
        mainReader.read(inputXLS, beans);
        
      //table 1
        String insertQuery = "INSERT INTO ui_component_mapping(ui_component_mapping_id,label,parent_id,order_no,ui_component_id,ui_child_id,active)"
        	+"VALUES(?,?,?,?,?,?,?)";
        PreparedStatement preStmt = conn.prepareStatement(insertQuery); 
        int rowCount = 0;
        screenComponentData.getChildList().remove(0);
        for(UIComponentMapping screenVO: screenComponentData.getChildList()){
	        	//preStmt.setString(1, screenVO.getuIComponentMappingId());
	        	preStmt.setString(2, screenVO.getLabel());
	        //	preStmt.setString(3, screenVO.getParentId());
	        //	preStmt.setString(4, screenVO.getOrderNumber());
	        	preStmt.setString(5, screenVO.getuIComponentId());
	        	preStmt.setString(6, screenVO.getActive());
	        	preStmt.setString(7, "Y");
	        	rowCount = +preStmt.executeUpdate();
        }
        System.out.println("inserted record count: "+rowCount);
      //table 2
        insertQuery = "INSERT INTO ui_component_details(ui_component_details_id,label,ui_component_type,doc_name,active)"
        	+"VALUES(?,?,?,?,?)";
        preStmt = conn.prepareStatement(insertQuery); 
        rowCount = 0;
        screenComponentData.getUiComponentList().remove(0);
        for(UIComponentDetail dependantVO: screenComponentData.getUiComponentList()){
	        //	preStmt.setString(1, dependantVO.getuIComponentDetailId());
	        	preStmt.setString(2, dependantVO.getLabel());
	        	preStmt.setString(3, dependantVO.getuIComponentType());
	        	preStmt.setString(4, dependantVO.getActive());
	        	preStmt.setString(5, "Y");
	        	rowCount = +preStmt.executeUpdate();
        }
        System.out.println("inserted record count: "+rowCount);
	}

}