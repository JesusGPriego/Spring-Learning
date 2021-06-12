<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form's info</title>
</head>
<body>

	<h1>Student data:</h1>
	
	<p>name: ${student.name} surname: ${student.surname}
	<br>Genre: ${student.genre}
	</p>
	
	<h3>Subject/s:</h3>
	
	<p>${student.subject}</p>
	
	<h3>City:</h3>
	
	<p>${student.city}</p>
	
	<h3>Languages:</h3>
	<p>${student.language}</p>

</body>
</html>