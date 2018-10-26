package com.mahendra;

import java.sql.*;

public class Main2 {

	public static void main(String[] args) {
		String driver = "org.apache.derby.jdbc.ClientDriver";
		String url = "jdbc:derby://localhost:1527/sample";
		String user = "user";
		String pass ="pass";
		try(Connection con = ConnectionUtil.getConnection(driver, url, user, pass)){
			Statement st = con.createStatement();
			st.execute("CREATE TABLE emp2 (empid int primary key, ename varchar(20), desg varchar(20)) ");
			st.close();
			
			//Prepared Statement with Positional parameters (Max 9)
			PreparedStatement ps = con.prepareStatement("INSERT into emp2 VALUES(?,?,?)");
			ps.setInt(1, 101); //First one is EMPID
			ps.setString(2, "Rahul Gandhi");//Second one is name
			ps.setString(3, "President"); //Third one is designation
			
			int rows = ps.executeUpdate();
			System.out.println("Record added : "+rows);
			ps.close();
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}

	}

}
