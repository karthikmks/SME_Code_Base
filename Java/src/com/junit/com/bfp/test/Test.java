package com.junit.com.bfp.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author tiruppathir
 *
 */
public class Test {

	/*public static void main(String[] args)
	{
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String dataSourceName = "TestDatabase1";
			String dbURL = "jdbc:odbc:" + dataSourceName;
			Connection con = DriverManager.getConnection(dbURL, "",""); 
			Statement s = con.createStatement();
			s.execute("select * from table1");
			ResultSet rs = s.getResultSet(); 
			if (rs != null) 
				while ( rs.next() ) 
				{
					System.out.println("Data from column_name: " + rs.getString(1) );
					System.out.println("Data from column_name: " + rs.getString(2) );
					System.out.println("Data from column_name: " + rs.getString(3) );
				}

			s.close(); // close the Statement to let the database know we're done with it
			con.close(); // close the Connection to let the database know we're done with it
		}
		catch (Exception err) {
			System.out.println("ERROR: " + err);
		}
	}*/

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\tiruppathir\\Desktop\\IMG_2523.jpg");
			InputStream in = new FileInputStream(file);
			byte[] chunk = new byte[335872];
			int i;
			while((i = in.read(chunk)) != -1) {
				System.out.println("hi");
			}	

			in.close();
			file = null;
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}