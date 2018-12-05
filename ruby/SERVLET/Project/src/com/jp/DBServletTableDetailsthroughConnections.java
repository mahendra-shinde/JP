package com.jp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBServletTableDetailsthroughConnections
 */
@WebServlet("/DBServletTableDetailsthroughConnections")
public class DBServletTableDetailsthroughConnections extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBServletTableDetailsthroughConnections() {
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
		
		
		 try{
			 ConnectionUtil conUtil = new ConnectionUtil();
			 ResultSet rs = conUtil.getTableNames(tableName);
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
