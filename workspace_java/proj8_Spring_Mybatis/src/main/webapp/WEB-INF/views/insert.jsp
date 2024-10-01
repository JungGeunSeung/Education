<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/proj8/member/insert">
		empno : <input type="number" name="empno"><br>
		ename : <input type="text" name="ename"><br>
		job : <input type="text" name="job"><br>
		hiredate : <input type="date" name="hiredate"><br>
		<input type="submit" value="만들기">
	</form>
</body>
</html>