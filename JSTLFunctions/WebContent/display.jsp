<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    <%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %>
    <%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<c:set var="str" value="Guruvinay is a java develepor"/>
		
		Sentence = ${str}
		<br>
		<br>
		
		<!-- Length of the sentence -->
		length of Sentence = ${fn:length(str)}
		
		<!-- Splitting the sentence -->
		<c:forEach items="${fn:split(str,' ')}" var="s">
		<br>
		<br>
		 ${s}
		</c:forEach>
		<br>
		<br>
		
		<!-- Remaining functions -->
	
		The Index of given String = ${fn:indexOf(str,"is")}
		<br>
		<br>
		
		<!-- Whether it contains give text -->
		
		Is there : ${fn:contains(str,'java')} 
		<br>
		<br>
		
		<c:if test="${fn:contains(str,'java')}">
		
			Java is there buddy
		
		</c:if>
		<br>
		<br>
		<!-- convert lower into uppercase -->
		
		${fn:toUpperCase(str)}
	
</body>
</html>