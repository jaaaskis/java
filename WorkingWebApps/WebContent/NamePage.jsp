<%-- 1. The following tag allows the use of the JSP tags in this file: --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%-- 2. The following tag allows the use of the JSTL core tags in this file: --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>First JSP Page with JSTL</h1>

	<form action="NamePage.jsp" method="POST">
		<p><label>First name: </label><input type="text" name="txtFirstName" /></p>
		<p><input type="submit" value="Display name" /></p>
	</form>
	
	<p>
		<%-- Here we display the greeting using a JSTL tag --%>
		<c:out value="${ param.txtFirstName }"/>
	</p>

</body>
</html>