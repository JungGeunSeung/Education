<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="/proj8/member/update">
		empno : ${ list.empno }<input type="hidden" name="empno" value="${ list.empno }"><br>
		ename : <input type="text" name="ename" value="${ list.ename }"><br>
		job : <input type="text" name="job" value="${ list.job }"><br>
		hireDate : ${ list.hireDate }<br>
		<input type="submit" value="수정">
	</form>
</body>
</html>