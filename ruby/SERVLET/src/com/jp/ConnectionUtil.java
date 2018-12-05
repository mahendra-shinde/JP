package com.jp;

import java.sql.*;

public class ConnectionUtil {

	
	
	public static  Connection getConnection () throws SQLException  {
		Connection con = null;
		
		 try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("JDBC Driver found and Loaded!");
	         con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","hr","hr");
	         System.out.println("Connected to DB");
	         return con;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			con.close();			
		}
		return con;
         
    
	}
  
	
	
	public static boolean checkIfUserExists(String userName,String password)  {
		
		PreparedStatement st = null;
        ResultSet rs = null;	
        
        
		String sqlQuery = "Select count(*) from employees where FIRST_NAME =? and LAST_NAME = ?";
		
		Connection con=null;
		try {
			con = ConnectionUtil.getConnection();
			st = con.prepareStatement(sqlQuery);
			st.setString(1,userName);
			st.setString(1,password);
			
			rs = st.executeQuery();
			rs.next();
			
			int count =rs.getInt(1);
			System.out.println(count);
			if (count > 0){
				return true;
			}
			else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			
		}		
		finally{
			
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return false;		
	
		
	}
}
