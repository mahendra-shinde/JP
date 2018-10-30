package com.mahendra;

import java.sql.*;

public class Main3 {

	public static void main(String[] args) {
		String driver = "org.apache.derby.jdbc.ClientDriver";
		String url = "jdbc:derby://localhost:1527/sample";
		String user = "user";
		String pass ="pass";
		try(Connection con = ConnectionUtil.getConnection(
				driver, url, user, pass)){
			con.setAutoCommit(false);
			Statement st = con.createStatement();
			//Step1 : Print emp2 records
			System.out.println("Before delete");
			readEmp(st);
			//Step2 : Delete all records
			deleteEmp(st);
			//Step3: show them
			System.out.println("After delete");
			readEmp(st);
			con.rollback();
			System.out.println("After rollback");
			readEmp(st);
		
		}catch(SQLException se) {
			se.printStackTrace();
		}
	}
	
	private static void readEmp(Statement st)throws SQLException {
		ResultSet rs = st.executeQuery("select * from emp2");
		while(rs.next()) {
			System.out.println("Record found: ");
			System.out.println(rs.getString("ename"));
		}
	}
	
	private static void deleteEmp(Statement st)throws SQLException{
		int rows = st.executeUpdate("delete from emp2");
		System.out.println("Rows deleted "+rows);
	}
	
	
	

}
