<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 추가하기</title>
</head>
<body>
	<h2>emp2 사원추가</h2>
	<form method="post" action="join">
		사원번호 : <input type="text" name="empno"><br>
		사원이름 : <input type="text" name="ename"><br>
		사원급여 : <input type="text" name="sal"><br>
		사원직책 :
		<select name="job">
			<option value="CLERK">CLERK</option>
			<option value="SALESMAN">SALESMAN</option>
			<option value="MANAGER">MANAGER</option>
			<option value="ANALYST">ANALYST</option>
			<option value="PRESIDENT">PRESIDENT</option>
		</select><br>
		사원부서 : <input type="text" name="deptno"><br>
		<input type="submit" name="추가하기"><br>
		
	</form>
</body>
</html>