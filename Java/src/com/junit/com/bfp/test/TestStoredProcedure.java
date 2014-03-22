package com.junit.com.bfp.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author tiruppathir
 *
 */
public class TestStoredProcedure {

	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbURL = "jdbc:mysql://172.25.100.20:3306/loan_management";
			Connection con = DriverManager.getConnection(dbURL, "root","admin"); 
			String getDBUSERByUserIdSql = "{call ora_sp_decode3(?, ?)}";
			CallableStatement callableStatement = con.prepareCall(getDBUSERByUserIdSql);
			callableStatement.setInt(1, 0);
			callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
			// execute getDBUSERByUserId store procedure
			callableStatement.executeUpdate();			 
			System.out.println(callableStatement.getString(2));
			
			con.close(); // close the Connection to let the database know we're done with it
		}
		catch (Exception err) {
			System.out.println("ERROR: " + err);
		}
	}

}