<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<title>Login Page</title>
	<style>
        body 
        {
            background-color: #f2f2f2;
        }

        form 
        {
            margin-top: 50px;
            background-color: white;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px 0px grey;
        }

   	</style>
</head>
<body>
	<jsp:include page="index.jsp"></jsp:include>
	<div class="container h-100">
      <div class="row h-100 justify-content-center align-items-center">
        <form action="AdminLoginServlet" method="post">
          <h1 class="text-center">Admin Login</h1>
          <div class="form-group">
            <label for="username">Username</label>
            <input type="text" class="form-control" id="username" name="username" placeholder="Enter username">
          </div>
          <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" id="password" name="password" placeholder="Enter password">
          </div>
          <button type="submit" class="btn btn-primary btn-block">Submit</button>
        </form>
      </div>
    </div>
</body>
</html>