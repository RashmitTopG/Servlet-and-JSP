<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	This is the display Page
	
	<%
		
		String namer = (String)request.getAttribute("name");
		out.println(namer);
	%>
	
	${name}<br/>
	<c:out value="${name}"/>
	${student.name}
	
</body>
</html>