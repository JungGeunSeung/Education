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
			<th>수정</th>
			<th>삭제</th>
		</tr>
			<tr>
				<td>${ list.empno }</td>
				<td>${ list.ename }</td>
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
				<td>
					<form method="get" action="/proj8/member/write/update">
						<input type="hidden" name="empno" value="${ list.empno }">
						<input type="hidden" name="ename" value="${ list.ename }">
						<input type="hidden" name="job" value="${ list.job }">
						<input type="hidden" name="hireDate" value="${ list.hireDate }">
						<input type="submit" value="수정하기">
					</form>
				</td>
			</tr>
	</table>
</body>
</html>