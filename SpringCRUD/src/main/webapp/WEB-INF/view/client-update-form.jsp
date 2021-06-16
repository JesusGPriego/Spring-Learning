<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Update Form</title>
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css"/>
	</head>
	<body>
		<h1>Update client form.</h1>
		<form:form action="updatedClient" modelAttribute ="client" method="POST">
			<form:hidden path="id"/>
			<table>		
				<tr>
					<td>Name: </td>
					<td><form:input path="name" /><form:errors path="name" style="color:red"/></td>
				</tr>
				<tr>
					<td>Surname: </td>
					<td><form:input path="surname" /><form:errors path="surname" style="color:red"/></td>
				</tr>
				<tr>
					<td>Email: </td>
					<td><form:input path="email" /><form:errors path="email" style="color:red"/></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Update client"/></td>
				</tr>
			</table>
		</form:form>
	</body>
</html>