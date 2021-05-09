<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action= "addAlien">
		<input type="text" name="aId" placeholder="Enter Alien Id"/><br/>
		<input type="text" name="aName" placeholder="Enter Alien Name"/><br/>
		<input type="text" name="tech" placeholder="Enter Technology"/><br/>
		<input type="submit" name="submit"/>
	</form>
	
	<form action= "getAlien">
		<input type="text" name="aId" placeholder="Enter Alien Id"/><br/>
		<input type="submit" name="submit"/>
	</form>
</body>
</html>