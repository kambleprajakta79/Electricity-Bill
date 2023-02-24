package com.eb.dao;

import java.sql.Connection;


import java.sql.PreparedStatement;

import com.eb.utility.DbConnection;

public class CustomerDao {

	static Connection con = DbConnection.getConnection();
	
	public boolean addCustomer(int custID, String name, String address, String contact_number, String email) 
	{
		
		String query ="insert into customers(customer_id,full_name,address,contact_number, email) values(?,?,?,?,?)";
 		
 		try
 		{
 			PreparedStatement ps = con.prepareStatement(query);
 			ps.setInt(1, custID);
 			ps.setString(2, name);
 			ps.setString(3, address);
 			ps.setString(4, contact_number);
 			ps.setString(5, email);
 			
 			
 			int i = ps.executeUpdate();
 		
	 		if(i>0)
	 		{
	 			return true;
	 		}
	 		
 		}
 		catch(Exception e){
 			e.printStackTrace();
 		}
		return true;
 		
		
	}

}
