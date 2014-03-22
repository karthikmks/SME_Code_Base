package com.junit.com.bfp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
			Connection con = DriverManager.getConnection("jdbc:mysql://172.25.100.20:3306/loan_management" ,"root", "admin"); //Create Connection with Data Source Name : HOD_DATA
			Statement s = con.createStatement(); // Create Statement
			String query = "select * from jewel_category"; // Create Query
			s.execute(query); // Execute Query
			System.out.println("Executing Query...");
			ResultSet rs = s.getResultSet(); //return the data from Statement into ResultSet
			System.out.println("Query Executed..");
			while(rs.next()) // Retrieve data from ResultSet
			{
				System.out.print("Employee Id : "+rs.getString(1)); //1st column of Table from database
				System.out.print(" Employee Name : "+rs.getString(2)); //2nd column of Table
				System.out.println(" , Age : "+rs.getString(3)); //3rd column of Table
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

}