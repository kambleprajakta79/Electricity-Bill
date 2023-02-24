package com.eb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.eb.utility.DbConnection;

public class ReadingDao {
	
	static Connection con = DbConnection.getConnection();
	public boolean addReading(int cust_id, int reading_value, String reading_date) 
	{
		System.out.println("database connecting...");
		String query ="insert into meter_readings(customer_id,reading_date,reading_value) values(?,?,?)";
 		
 		try
 		{
 			PreparedStatement ps = con.prepareStatement(query);
 			ps.setInt(1, cust_id);
 			ps.setString(2, reading_date);
 			ps.setInt(3, reading_value);
 			
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

}
