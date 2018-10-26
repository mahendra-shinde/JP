package com.mahendra;

import java.sql.*;

public class ConnectionUtil {

	public static Connection getConnection() {
		String driver = "org.apache.derby.jdbc.ClientDriver";
		String url = "jdbc:derby://localhost:1527/sample";
		String user = "user";
		String pass ="pass";
		return getConnection(driver, url, user, pass);
	}
	
	public static Connection getConnection(String driver, String url, String user, String pass) {
		
		//Step1 : Load JDBC Driver class
		try {
		Class.forName(driver);
		}catch(ClassNotFoundException ex) {
			System.out.println("No JDBC Driver found");
			return null;
		}
		
		//Step2: Establish connection
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Established connection with "+con.getMetaData().getDatabaseProductName());
			return con;
		}catch(SQLException ex) {
			System.out.println("Unable to connect! "+ex.getMessage());
			return null;
		}
	}
}
