<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>readList</title>
</head>
<body>
	<div>사원번호 : ${ emp.empno }</div>
	<div>사원이름 : ${ emp.ename }</div>
	<div>사원직책 : ${ emp.job }</div>
	<div>입사일 : ${ emp.hiredate }</div>
	<div>
	<c:url var="insert" vaule="insert">
		<c:param name="empno" value="${ emp.empno }"/>
		<c:param name="ename" value="${ emp.ename }"/>
		<c:param name="job" value="${ emp.job }"/>
		<c:param name="hiredate" value="${ emp.hiredate }"/>
	</c:url>
		<a href="insert">수정하기</a>
	</div>
</body>
</html>