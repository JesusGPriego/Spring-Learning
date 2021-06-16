<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css"/>
	<title>Client List</title>
</head>
<body>
<h1>Client List</h1>


	<table>
	
		<tr>
			<th>id</th>
			<th>Name</th>
			<th>Surname</th>
			<th>Email</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		
			<c:forEach var="client" items="${clients}">
			
				<c:url var="updateLink" value="/client/clientUpdateForm">
					<c:param name="clientId" value="${client.id}"/>
				</c:url>
					
				<c:url var="deleteLink" value="/client/deleteClient">
					<c:param name="clientId" value="${client.id}"/>
				</c:url>
			
				<tr>
					<td>${client.id}</td>
					<td>${client.name}</td>
					<td>${client.surname}</td>
					<td>${client.email}</td>
					<td><a href="${updateLink}"><input type="button" value="update"/></a></td>
					<td><a href="${deleteLink}"><input type="button" value="delete" 
						onclick="if(!confirm('Delete selection?')) return false"/></a></td>
				</tr>
			
			</c:forEach>
			
	</table>


	<br>
	
	<input type="button" value="New Client" onclick="window.location.href='clientForm'; return false;"/>

</body>
</html>