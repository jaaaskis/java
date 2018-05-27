<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Search by ID</title>
</head>
<body>

	<div>
		<h3>Student search by ID</h3>

		<form action="studentIdSearch" method="GET">
			<input type="text" name="idSearch" /> <input type="submit"
				value="Show selected student" />
		</form>

		<c:if test="${ studentList != null && studentList.size() > 0 }">
			<c:forEach items="${ studentList }" var="studentObject">
				<p><c:out value="${ studentObject }"></c:out></p>
			</c:forEach>
		</c:if>

		<%-- If the list is empty, then show an appropriate message --%>
		<c:if test="${ studentList != null && studentList.size() == 0 }">
			No students found by this ID
		</c:if>
	</div>

</body>
</html>