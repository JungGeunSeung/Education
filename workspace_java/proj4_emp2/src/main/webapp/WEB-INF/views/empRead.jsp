<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할일 관리 > 할일 상세</title>
</head>
<body>

	<div>사원번호 : ${ emp.empno }</div>
	<div>사원이름 : ${ emp.ename }</div>
	<div>사원직책 : ${ emp.job }</div>
	<div>사원사수 : ${ emp.mgr }</div>
	<div>입사일 : ${ emp.hireDate }</div>
	<div>사원급여 : ${ emp.sal }</div>
	<div>성과금 : ${ emp.comm }</div>
	<div>사원부서 : ${ emp.deptno }</div>

	<c:url var="list1" value="emp">
	</c:url>
	<a href="${ list1 }">목록으로 돌아가기</a>
	<br>
	<c:url var="modify" value="modify">
		<c:param name="empno" value="${ emp.empno }" />
		<c:param name="ename" value="${ emp.ename }" />
		<c:param name="job" value="${ emp.job }" />
		<c:param name="mgr" value="${ emp.mgr }" />
		<c:param name="hireDate" value="${ emp.hireDate }" />
		<c:param name="sal" value="${ emp.sal }" />
		<c:param name="comm" value="${ emp.comm }" />
		<c:param name="deptno" value="${ emp.deptno }" />
	</c:url>
	<a href="${modify}" name="modify">수정하기</a>
	
	<form method="post" action="empDelete">
		<input type="hidden" name="empno" value="${emp.empno}">
		<input type="submit" value="삭제">
	</form>
</body>
</html>