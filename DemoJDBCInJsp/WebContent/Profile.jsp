<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ page import="java.sql.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	guruvinay<br>
	329<br>
	<br>
	<br>
	<br>
	<br>
	
	<%
	
	String url = "jdbc:mysql://localhost:3306?user=root&password=1234";
	String sql = "SELECT * FROM `tech-no`.user where id =2";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url);
	Statement st = con.createStatement();
	 
	ResultSet rs = st.executeQuery(sql);
	rs.next();
	
	%>	
	
	User Id :<%=rs.getString(1) %><br>
	Username :<%=rs.getString(2) %><br>
	FirstName :<%=rs.getString(3) %><br>
	Lastname :<%=rs.getString(4) %><br>
	Age :<%=rs.getString(5) %><br>
	Password :<%=rs.getString(6) %><br>


</body>
</html>