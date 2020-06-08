<%@page import="org.jsp.web.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

	Hii Students

	<%
	Student s1 = (Student) session.getAttribute("student");

	//Student s1 = (Student) request.getAttribute("student");

	out.println(s1);
%>

</body>
</html>