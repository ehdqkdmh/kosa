<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 태그 라이브러리 디렉티브 page,include,taglib jstl태그 라이브러리를 사용하겠다는 의미-->



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
<form action="<c:url value='/list'/>" method="get">
	<table border = 1>
	<tr>
		<th>사원번호</th>
		<th>이름</th>
		<th>비밀번호</th>
		<th>직무</th>
		
	</tr>
	<c:forEach var="user" items="${user}">
	<tr>
		
		<td>${user.userId }</td>
		<td>${user.userName }</td>
		<td>${user.userPassword }</td>
		<td>${user.userRole}</td>
	
		
	</tr>
	</c:forEach>
	</table></form>
</body>
</html>