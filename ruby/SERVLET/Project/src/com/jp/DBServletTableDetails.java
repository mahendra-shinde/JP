package com.jp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBServletDetails
 */
@WebServlet("/DBServletTableDetails")
public class DBServletTableDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBServletTableDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tableName = request.getParameter("tableName");
		PrintWriter out=response.getWriter();
		out.write("<Table border =1>");	

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;	

		 try {
				Class.forName("oracle.jdbc.OracleDriver");
				System.out.println("JDBC Driver found and Loaded!");
		         con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","hr","hr");
		         System.out.println("Connected to DB");
		         
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
						
			} 
		 
		 //Step 2: Create a connection
         try{
             con = DriverManager.getConnection(
                     "jdbc:oracle:thin:@localhost:1521/orcl","hr","hr");
             System.out.println("Connected to DB");
         }catch(SQLException ex){
             System.out.println("Unable to connect: "+ex.getMessage());
             return;
         }
         
         //Step 3: Create Statement
         try {
            st = con.createStatement();
             System.out.println("Statement created!");
         }catch(SQLException ex){
             System.out.println("Unable to create a statement! "+ ex.getMessage());
         }
	     
         try{
             rs = st.executeQuery("Select * from " + tableName);
             ResultSetMetaData rsmd =rs.getMetaData();
             int ColCount = rsmd.getColumnCount();
             
             while(rs.next()) {
            	 out.println("<TR>");
            	 for (int i=1;i<=ColCount;i++)
            	 {
            		 out.println("<TD>");
            		 out.println(rs.getString(i));            		 
            		 out.println("</TD>");
            	 }            	 
            	 
            	 out.println("</TR>");
             }
             	out.println("</Table>");
             
         }catch(SQLException ex){
             System.out.println("Unable to Fetch the data ! "+ ex.getMessage());
         }

	    
		}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
