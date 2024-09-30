<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할일 관리 > 할일 수정</title>
<style>
	a {
	text-decoration: none;
	color: black;
	}
</style>
</head>
<body>

	<form method="post" action="modify">
		<input type="hidden" name="empno" value="${emp.empno}"><br>
		사원이름 : <input type="text" name="ename" placeholder="제목" value="${emp.ename}"><br>
		입사날짜 : <input type="date" name="hireDate" id="hireDate" value="${emp.hireDate}"><br>
		직책 : <input type="text" name="job" value="${ emp.job }"><br>
		사원급여 : <input type="number" name="sal" value="${ emp.sal }"><br>
		사원부서 : <input type="number" name="deptno" value="${ emp.deptno }"><br>
		성과금 : <input type="number" name="comm" value="${ emp.comm }"><br>
		사원사수 : <input type="number" name="mgr" value="${ emp.mgr }"><br>
		
		<input type="submit" value="글 수정하기">
	</form>
</body>
</html>