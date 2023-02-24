package com.eb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		String username = req.getParameter("username");
		 String password = req.getParameter("password");
		 
		 if (username.equals("kambleprajakta79") && password.equals("12345")) 
		 {
		      RequestDispatcher rd = req.getRequestDispatcher("admin_dashboard.jsp");
		      rd.forward(req, res);
		 } 
		 else 
		 {
			 PrintWriter out = res.getWriter();
			out.println("Please enter valid username or passward...");
			
		 }
	}

}
