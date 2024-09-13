<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<table border="1">
			<tr>
				<td>사원번호</td>
				<td>이름</td>
				<td>직책</td>
				<td>사수</td>
				<td>입사일</td>
				<td>급여</td>
				<td>상여금</td>
				<td>부서번호</td>
			</tr>
	<c:forEach var="list" items="${ list }">
			<tr>
				<td>${ list.empno }</td>
				<td>${ list.ename }</td>
				<td>${ list.job }</td>
				<td>${ list.mgr }</td>
				<td>${ list.hireDate }</td>
				<td>${ list.sal }</td>
				<td>${ list.comm }</td>
				<td>${ list.deptno }</td>
			</tr>
	</c:forEach>
		</table>
</body>
</html>