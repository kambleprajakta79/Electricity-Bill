<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Electricity Bill</title>
	<style>
		.add_user
		{
			margin-left:20%;
			text:center;
		}
		.btn_submit
		{	
			width:90%;
			margin-left:5%;
		}
	</style>
</head>
<body>
	<jsp:include page="admin_dashboard.jsp"></jsp:include>
	<div class="add_user">
	
	<h1 >Customer Registration Form</h1>
	<form method="get" action="AddCustomerServlet">
		<table>
			<tr>
				<td>
					<label for="name">Customer Id:</label>
				</td>
				<td>
					<input type="text" id="cust_id" name="cust_id" required>
				</td>
			</tr>
			<tr>
				<td>
					<label for="name">Name:</label>
				</td>
				<td>
					<input type="text" id="name" name="name" required>
				</td>
			</tr>
			<tr>
				<td>
					<label for="address">Address:</label>
				</td>
				<td>
					<input type="text" id="address" name="address" required>
				</td>
			</tr>
			<tr>
				<td>
					<label for="contact_number">Contact Number:</label>
				</td>
				<td>
					<input type="text" id="contact_number" name="contact_number" required>
				</td>
			</tr>
			<tr>
				<td>
					<label for="email">Email:</label>
				</td>
				<td>
					<input type="email" id="email" name="email" required>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input class = "btn_submit" type="submit" value="Submit">
				</td>
				
			</tr>
		</table>
	</form>
	</div>
	
</body>
</html>