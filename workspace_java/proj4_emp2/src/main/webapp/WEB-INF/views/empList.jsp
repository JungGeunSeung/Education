<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="emp2.dto.EmpDTO" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empList</title>
</head>
<body>
<form method="get" action="emp2">
사원번호를 입력하여 조회 : <input type="number" name="empno" value="null">
사원이름를 입력하여 조회 : <input type="text" name="ename">
<input type="submit" value="조회">
</form>
<table border="1">
	<tr>
		<th>사원번호(empno)</th>
		<th>사원이름(ename)</th>
		<th>직책(job)</th>
		<th>입사일(hireDate)</th>
	</tr>
	<c:if test="${ list.size() <= 0 }">
		<tr>
			<td colspan="4" style="text-align:center">조회된 결과가 없습니다.</td>
		</tr>
	</c:if>
	<c:if test="${ list.size() > 0 }">
	<c:forEach var="emp" items="${ list }">
		<tr>
			<td>${emp.empno }</td>
			<td>${emp.ename }</td>
			<td>${emp.job }</td>
			<td>${emp.hireDate}</td>
		</tr>
	</c:forEach>
	</c:if>
</table>
	<hr>
<table border="1">
	<tr>
		<th>empno</th>
		<th>ename</th>
		<th>job</th>
		<th>hireDate</th>
	</tr>

	
	<%
		List<EmpDTO> list = (List)request.getAttribute("list");
		
		// 전통 for문
// 		for(int i =0; i < list.size(); i++) {
// 			EmpDTO dto = (EmpDTO)list.get(i);
// 			int empno = dto.getEmpno();
// 			out.print(empno + ", ");
// 		}
		
		// 향상된 for문
		for (EmpDTO dto : list) {
			int empno = dto.getEmpno();
			out.print(empno + ", ");
		}
	%>
</table>

</body>
</html>