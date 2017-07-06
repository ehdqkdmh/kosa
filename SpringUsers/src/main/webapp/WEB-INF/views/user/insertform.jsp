<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>사원정보 입력</h1>
	<form action="<c:url value='/user/insert'/>" method="post">
		아이디 : <input type="text" name="userId"><br>
		이름 : <input type="text" name="userName"><br>
		비밀번호 : <input type="text" name="userPassword"><br>
		권한 : <input type="text" name="userRole"><br>
		
		<input type="submit" value="저장">
		<input type="reset" value="취소">
	</form>
</body>
</html>