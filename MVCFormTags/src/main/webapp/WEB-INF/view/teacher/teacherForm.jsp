<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
</head>
<body>
	<!-- actions refers to the method that will be executed when pressing submit button -->
	<form:form action="formHandler" modelAttribute="teacher">
		<p>Teacher data: <br/>
			Name:  <form:input path="name"/> <form:errors path="name" style="color:red"/>
			Surname:  <form:input path="surname"/> <br>
			Age:  <form:input path="age"/><form:errors path="age" style="color:red"/>
			<b><br/>Genre: <br/></b>
			Male <form:radiobutton path="genre" value="Male"/>
			Female <form:radiobutton path="genre" value="Female"/>
			
		</p>
		
		<!-- list -->
		<form:select path="subject" multiple="true">
			<form:option value="Design" label="Design"/>
			<form:option value="OOP" label="OOP"/>
			<form:option value="BIGDATA" label="Big Data"/>
		</form:select>
		<br>
		<!-- radio buttons -->
		<p>City:<br/>
			London <form:radiobutton path="city" value="London"/>
			Paris <form:radiobutton path="city" value="Paris"/>
			Barcelona <form:radiobutton path="city" value="Barcelona"/>
			Munich <form:radiobutton path="city" value="Munich"/>
		</p>
		<p>Postal Code: <form:input path="postalCode"/><form:errors path="postalCode" style="color:red"/></p>
		
		<p>Languages:<br/>
			English <form:checkbox	 path="language" value="English"/>
			Spanish <form:checkbox path="language" value="Spanish"/>
			German <form:checkbox path="language" value="German"/>
			Chinese <form:checkbox path="language" value="Chinese"/>
		</p>
		<p>Email: <form:input path="email"/> <form:errors path="email" style="color:red"/></p>
		<input type="submit" value="Submit"/>
	
	</form:form>



</body>
</html>