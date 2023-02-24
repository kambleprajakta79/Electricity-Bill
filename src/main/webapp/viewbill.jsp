<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	<jsp:include page="index.jsp"></jsp:include>
	<div class="add_user">
		<form action="ViewBillServlet">
			<h1>See your bill</h1>
			<table>
			<tr>
				<td>
					<label for="name">Enter your customer Id:</label>
				</td>
				<td>
					<input type="text" id="cust_id" name="cust_id" required>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input class = "btn_submit" type="submit" value="Show Bill">
				</td>
				
			</tr>
		</table>
			
		</form>
	</div>
	
	
</body>
</html>