package com.eb.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eb.dao.CustomerDao;

@WebServlet("/AddCustomerServlet")
public class AddCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int custID = Integer.parseInt(request.getParameter("cust_id"));
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String contact_number = request.getParameter("contact_number");
		String email = request.getParameter("email");
		
		CustomerDao cd = new CustomerDao();
		
		try 
		{
			boolean b = cd.addCustomer(custID,name, address, contact_number, email);
			
			if(b)
			{
				response.sendRedirect("add_customer2.jsp");
			}
			else
			{
				String errMsg = "Email already exist";
				request.setAttribute("errMsg", errMsg);
				request.getRequestDispatcher("admin_dashboard.jsp").include(request, response);
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}	

	}
 

}
