<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>EMP0</h1>
	<a href="/proj8/member/write/insert">사원 추가</a>
	<table border="1">
		<tr>
			<th>empno</th>
			<th>ename</th>
			<th>job</th>
			<th>mgr</th>
			<th>hiredate</th>
			<th>sal</th>
			<th>comm</th>
			<th>deptno</th>
			<th></th>
		</tr>
		<c:forEach var="list" items="${ list }">
			<tr>
				<td>${ list.empno }</td>
				<c:url var="name" value="/member/write/update">
					<c:param name="empno" value="${ list.empno }" />
					<c:param name="ename" value="${ list.ename }" />
					<c:param name="job" value="${ list.job }" />
					<c:param name="hireDate" value="${ list.hireDate }" />
				</c:url>
				<td><a href="${name}">${ list.ename }</a></td>
				<td>${ list.job }</td>
				<td>${ list.mgr }</td>
				<td>${ list.hireDate }</td>
				<td>${ list.sal }</td>
				<td>${ list.comm }</td>
				<td>${ list.deptno }</td>
				<td>
					<form method="get" action="/proj8/member/delete">
						<input type="hidden" name="empno" value="${ list.empno }">
						<input type="submit" value="삭제하기">
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>