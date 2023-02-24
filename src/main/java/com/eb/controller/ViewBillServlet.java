package com.eb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eb.dao.BillDao;


@WebServlet("/ViewBillServlet")
public class ViewBillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		int cust_id = Integer.parseInt(request.getParameter("cust_id"));
		
		//BillDao bd = new BillDao();
		
		
			//boolean b = bd.viewbill(cust_id);
			
			
			
				request.setAttribute("cust_id", cust_id);
				request.getRequestDispatcher("viewbill2.jsp").include(request, response);	
			
			
		
			
	}

	

}
