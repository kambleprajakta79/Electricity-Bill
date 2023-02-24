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
	<form action="BillServlet">
		<h1>Generate Bill</h1>
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
					<label for="bill_date">Bill Date:</label>
				</td>
				<td>
					<input type="date" id="bill_date" name="bill_date" required>
				</td>
			</tr>
			<tr>
				<td>
					<label for="bill_due_date">Bill Due Date:</label>
				</td>
				<td>
					<input type="date" id="bill_due_date" name="bill_due_date" required>
				</td>
			</tr>
			<tr>
				<td>
					<label for="reading_value">Reading value:</label>
				</td>
				<td>
					<input type="text" id="reading_value" name="reading_value" required>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input class = "btn_submit" type="submit" value="Add reading">
				</td>
				
			</tr>
		</table>
</form>
	
</div>
</body>
</html>