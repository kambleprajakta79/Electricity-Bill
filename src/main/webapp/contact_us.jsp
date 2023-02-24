<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Us</title>
<style>
	body {
		font-family: Arial, sans-serif;
		margin: 0;
		padding: 0;
	}

	h1 {
		text-align: center;
		margin-top: 50px;
	}
	form {
		max-width: 400px;
		margin: 0 auto;
		padding: 30px;
		background-color: #f2f2f2;
		text-align: center;
	}

	label {
		display: block;
		margin-bottom: 10px;
	}
	input, textarea {
		width: 100%;
		padding: 10px;
		margin-bottom: 20px;
		font-size: 16px;
		box-sizing: border-box;
	}

	input[type="submit"] {
		background-color: #4CAF50;
		color: white;
		padding: 12px 20px;
		border: none;
		border-radius: 4px;
		cursor: pointer;
	}
	
</style>
</head>
<body>
	<jsp:include page="index.jsp"></jsp:include>
	<h1>Contact Us</h1>
	<div class="position">
		<form action="contact_us2.jsp" method="post">
			<div>
				<label for="name">Name:</label> <input type="text" id="name" name="name">
			</div>
			<div>
				<label for="email">Email:</label> <input type="email" id="email" name="email">
			</div>
			<div>
				<label for="message">Message:</label>
				<textarea id="message" name="message"></textarea>
			</div>
			<div>
				<input type="submit" value="Submit">
			</div>
		</form>
	</div>
	
</body>
</html>