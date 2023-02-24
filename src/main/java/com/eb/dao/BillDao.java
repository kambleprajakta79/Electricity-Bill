package com.eb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.eb.utility.DbConnection;

public class BillDao {

	static Connection con = DbConnection.getConnection();
	
	public boolean addbill(int cust_id, String bill_date, String bill_due_date, int reading_value, double billAmount) {
		
		System.out.println("database connecting...");
		String query ="insert into bill(customer_id,bill_date,bill_due_date,reading_value, bill_amount) values(?,?,?,?,?)";
 		
 		try
 		{
 			PreparedStatement ps = con.prepareStatement(query);
 			ps.setInt(1, cust_id);
 			ps.setString(2, bill_date);
 			ps.setString(3, bill_due_date);
 			ps.setInt(4, reading_value);
 			ps.setDouble(5, billAmount);
 			
 			int i = ps.executeUpdate();
 		
	 		if(i>0)
	 		{
	 			return true;
	 		}
	 		
 		}
 		catch(Exception e){
 			e.printStackTrace();
 		}
		
		return false;
	}

	public boolean viewbill(int cust_id) throws SQLException 
	{
		String query = " select * from customers inner join bill on customers.customer_id = bill.customer_id  where customers.customer_id=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, cust_id);
		
		ResultSet rs = ps.executeQuery();
		
		 if (rs.next()) 
	        {
	            String custID = rs.getString("customer_id");
	            String  full_name = rs.getString("full_name");
	            String address = rs.getString("address");
	            String contact_number = rs.getString("contact_number");
	            String email = rs.getString("email");
	            String bill_id = rs.getString("bill_id");
	            String bill_date = rs.getString("bill_date");
	            String bill_due_date = rs.getString("bill_due_date");
	            String reading_value = rs.getString("reading_value");
	            String bill_amount = rs.getString("bill_amount");
	            System.out.println(custID+full_name+bill_amount);
	           
			} 
			else 
			{
				System.out.println("Invalid customer id");
			}
		
		return false;
	}

}
