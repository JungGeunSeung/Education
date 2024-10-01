<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션으로 로그인</title>
</head>
<body>
	
	<form method="post" action="login">
		아이디(ename) : <input type="text" name="id" value="SMITH"><br>
		비밀번호(empno) : <input type="number" name="pw" value="7369"><br>
		<c:if test='${ param.code == "LO01" }'>
			<div style="color: red;">
				아이디 또는 비밀번호를 확인해주세요
			</div>
		</c:if>
		<input type="submit" value="로그인">
	</form>
	
</body>
</html>