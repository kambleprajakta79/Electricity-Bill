<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="com.eb.utility.DbConnection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Electricity Bill</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<style>
		.add_user
		{
			margin-left:20%;
			text:center;
		}
	</style>
</head>
<body>
	<jsp:include page="index.jsp"></jsp:include>
	<div class = "add_user">
		<%
			int cust_id = (int) request.getAttribute("cust_id");
			Connection con = DbConnection.getConnection();
			String query = "select * from customers inner join bill on customers.customer_id = bill.customer_id  where customers.customer_id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, cust_id);
			
			ResultSet rs = ps.executeQuery();
			 while (rs.next()) 
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
		            
		           
				 
		%>
		
		<div class="container mt-5">
		<h1>Electricity Bill</h1>
		<hr>
		<div class="row">
			<div class="col-md-6">
				<h3>Customer Information</h3>
				<p><strong>Customer ID:</strong> <%= custID %></p>
				<p><strong>Customer Name:</strong> <%= full_name %></p>
				<p><strong>Address:</strong> <%= address %></p>
				<p><strong>Contact Number:</strong> <%= contact_number %></p>
				<p><strong>Email:</strong> <%= email %></p>
			</div>
			<div class="col-md-6">
				<h3>Account Summary</h3>
				<p><strong>Bill ID:</strong><%= bill_id %></p>
				<p><strong>Bill Date:</strong> <%= bill_date %></p>
				<p><strong>Due Date:</strong> <%= bill_due_date %></p>
				<p><strong>Amount Due:</strong> <%= bill_amount %></p>
			</div>
		</div>
		<hr>
		<div class="row">
			<div class="col-md-12">
				<h3>Electricity Usage Details</h3>
				<table class="table table-bordered">
					<thead>
						<tr>
							<th>Electricity Meter Reading</th>
							<th>Previous Reading</th>
							<th>Current Reading</th>
							<th>Usage in kWh</th>
							<th>Rate per kWh (Rs)</th>
							<th>Total Amount (Rs)</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Electricity Meter</td>
							<td>-</td>
							<td> <%= reading_value %></td>
							<td>100</td>
							<td>7</td>
							<td><%= bill_amount %></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<%
		        }
	%>
	</div>
</body>
</html>