<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<!-- CSS only -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />
<link rel="stylesheet" href="template-styles.css" />
<link href="/css/loginstyle.css" rel="stylesheet" type="text/css">
</head>
<body >
<div style="text-align: center">

<h2>Administrative Login</h2>
<form action="LoginServlet" method="post">

	<input type="text" name="uname" placeholder="Enter Username" /><br/> <br/>
	
		<input type="text" name="upass" placeholder="Enter Password" /><br/> <br/>
	
		<input type="submit" value="Login" />
	
	</form>
</body>
</html>