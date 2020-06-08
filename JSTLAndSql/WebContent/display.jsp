<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    <%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	

	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306?user=root&password=1234"/>
	<sql:query var="rs" dataSource="${db}">SELECT * FROM `tech-no`.user</sql:query>
	
	<c:forEach items="${rs.rows}" var="user">
	
	<br><c:out value="${user.id}"></c:out> :<c:out value="${user.id}"></c:out> :<c:out value="${user.username}"></c:out> :<c:out value="${user.firstname}"></c:out> :<c:out value="${user.lastname}"></c:out> :<c:out value="${user.password}"></c:out> :
	
	</c:forEach>
	
</body>
</html>