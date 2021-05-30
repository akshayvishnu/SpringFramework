<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Welcome To ${myWebsiteTitle}</h1>
	
	<form action="processOrder">
	<div align="center">
		<label>Item Name</label>
		<input type="text" name="foodType" placeholder="Enter food type"/>
		<input type="submit" name="submit" value="Order Now">
	</div>
	</form>
</body>
</html>