<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Customer Registration</title>
	<style type="text/css">
		.error {color:red}
	</style>
</head>
<body>
	<h2>Registration Form</h2>
	<form:form action="processForm" modelAttribute="customer">
		
		<br><br>
		First Name: <form:input path="fname"/>
		
		<br><br>
		Last Name(<strong style="color:red">*</strong>): <form:input path="lname"/>
		<form:errors path="lname" cssClass="error"/>
		
		<br><br>
		Age(<strong style="color:red">*</strong>): <form:input path="age"/>
		<form:errors path="age" cssClass="error"/>
		
		<br><br>
		Mobile Number(<strong style="color:red">*</strong>): <form:input path="mobileNumber"/>
		<form:errors path="mobileNumber" cssClass="error"/>
		
		<br><br>
		Course Code(<strong style="color:red">*</strong>): <form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error"/>
		
		<br><br>
		<input type="submit" value="Submit"/>
		
	</form:form>
</body>
</html>