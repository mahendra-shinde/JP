package com.jp;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("txtName");
		String password = request.getParameter("txtPassword");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		ConnectionUtil conUtil = new ConnectionUtil();
		boolean blnResult = conUtil.checkIfUserExists(userName,password);
		
//		if(blnResult) {
//			out.write("<h1>Valid User</h1>");
//		}
//		else {
//			out.write("<h1>Invalid User</h1>");
//		}
		
		if(userName.equals("Admin") && (password.equals("Password"))){
			out.write("<h1>Valid User</h1>");
		}else {
			out.write("<h1>Invalid User</h1>");
		}
		out.flush();
		}
	}


