<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
	
	The confirm student is ${student.firstName} ${student.lastName}
	
	<br><br>
	Country is ${student.country}
	
	<br><br>
	Favourite Language is ${student.favouriteLanguage}
	
	<br><br>
	Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.selectedOperatingSystems}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
	
</body>
</html>