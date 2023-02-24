package com.eb.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eb.dao.BillDao;
import com.eb.dao.ReadingDao;

@WebServlet("/BillServlet")
public class BillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 int cust_id = Integer.parseInt(request.getParameter("cust_id"));
		 String bill_date = request.getParameter("bill_date");
		 String bill_due_date = request.getParameter("bill_due_date");
		 int reading_value =Integer.parseInt(request.getParameter("reading_value"));
		 
		 double rate = 7.15; // $0.15 per kWh
		 double billAmount = reading_value * rate;
		 
		 BillDao bd = new BillDao();
		 
		 try 
			{
				boolean b = bd.addbill(cust_id,bill_date,bill_due_date, reading_value,billAmount);
				
				if(b)
				{
					response.sendRedirect("add_reading2.jsp");	
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
