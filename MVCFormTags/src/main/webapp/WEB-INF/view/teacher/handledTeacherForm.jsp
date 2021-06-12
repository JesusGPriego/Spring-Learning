<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form's info</title>
</head>
<body>

	<h1>Teacher data:</h1>
	
	<p>name: ${teacher.name} surname: ${teacher.surname}
	<br>age: ${teacher.age}
	<br>Genre: ${teacher.genre}
	</p>
	
	<h3>Subject/s:</h3>
	
	<p>${teacher.subject}</p>
	
	<h3>City:</h3>
	
	<p>${teacher.city}</p>
	
	<h3>Postal Code:</h3>
	<p>${teacher.postalCode}</p>
	<h3>Languages:</h3>
	<p>${teacher.language}</p>
	
	<h3>Email:</h3>
	<p>${teacher.email}</p>

</body>
</html>