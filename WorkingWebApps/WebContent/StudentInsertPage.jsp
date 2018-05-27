<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Students</title>
</head>
<body>

	<div>

		<h2>Insert new student</h2>
		<div>

			<form action="insertStudent" method="POST">

				<label>ID: </label><input type="text" name="studentId"><br />
				<label>First Name: </label><input type="text" name="firstName" /><br />
				<label>Last Name: </label><input type="text" name="lastName" /><br />
				<label>Street Address: </label><input type="text" name="streetAddress" /><br /> 
				<label>Postcode:</label><input type="text" name="postCode" /><br /> 
				<label>Post office:</label><input type="text" name="postOffice" /><br />

				<button type="submit" value="Submit student">Insert Student</button>

			</form>

		</div>
	</div>

	<c:if test="${ result != null }">

		<c:if test="${ result == 0 }">
			The student is successfully inserted.
		</c:if>

		<c:if test="${ result == 1 }">
			Cannot insert the student. Student id is already in use.
		</c:if>

		<c:if test="${ result == -1 }">
			Program failed, please try again.
		</c:if>

	</c:if>

	<a href="http://localhost:8080/WorkingWebApps/StudentList.jsp">Click
		here to see student table</a>


</body>
</html>