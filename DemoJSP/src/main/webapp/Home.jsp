<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
	
	String url = "jdbc:postgresql://localhost:5432/test";
	String username = "postgres";
	String password = "root";
	String sql = "SELECT * FROM student WHERE roll = 103";
	
	/* Load Class into memory during runtime */
	Class.forName("org.postgresql.Driver");
	Connection con = DriverManager.getConnection(url,username,password);
	
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(sql);
	rs.next();
	
	%>
	
	Roll No: <%=rs.getString(1) %><br>
	Name : <%=rs.getString(2) %><br>
	Marks : <%=rs.getString(3) %><br>
	
</body>
</html>