package com.jp;

import java.sql.*;
import java.util.ArrayList;

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
        Connection con=null;
        
		String sqlQuery = "Select count(*) from employees where FIRST_NAME =? and LAST_NAME = ?";
		
		
		try {
			con = ConnectionUtil.getConnection();
			st = con.prepareStatement(sqlQuery);
			st.setString(1,userName);
			st.setString(2,password);
			
			rs = st.executeQuery();
			rs.next();
			
			int count =rs.getInt(1);
			rs.close();
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
//				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return false;		
	
		
	}
	
	
	
	public ArrayList<String> getTableNames() {
		Connection con =null;
        ResultSet rs = null;		
		 ArrayList<String> tables = new ArrayList<String>();
		try {
			con = ConnectionUtil.getConnection();
			DatabaseMetaData dmd = con.getMetaData();
			rs= dmd.getTables(null,null,null,new String[]{"TABLE"});
			//rs = getTables(null,null,null,null);
			while (rs.next()) {
				String str =rs.getString(3); 
				tables.add(str);
				System.out.println(str);
			}
		}
		catch (SQLException e){
			System.out.println(e.getMessage());
			e.printStackTrace();	
		}
		finally{				
			try {
				rs.close();				
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return tables;
		}
		
	}
	
	public ResultSet getTableNames(String tableName){
		PreparedStatement st = null;
        ResultSet rs = null;	
        Connection con=null;
        
		//String sqlQuery = "Select count(*) from employees where FIRST_NAME =? and LAST_NAME = ?";
		
		String sqlQuery = "Select * from "+ tableName;
		try {
			st = con.prepareStatement(sqlQuery);
			rs = st.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return rs;
		
	}
	


	
	
	


	
}
