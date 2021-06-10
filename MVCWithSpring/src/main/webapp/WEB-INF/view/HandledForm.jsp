<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css">
</head>
<body>

	

	<!-- This is the answer to the info sended by the user in the form. -->
	${identifier }
	
	<!-- Image using jsp tags -->
	<br>
	<!-- tested with .png files, apparently doesnt work.  -->
	<img alt="picture" src="${pageContext.request.contextPath}/resources/img/example.jpg" height="300"width="300">
	<br>
</body>
</html>