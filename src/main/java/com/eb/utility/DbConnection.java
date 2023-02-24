package com.eb.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getConnection()
	{
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/electricity_bill";
			String user = "root";
			String pass = "";
			con = DriverManager.getConnection(url, user, pass);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return con;
		
	}
}
