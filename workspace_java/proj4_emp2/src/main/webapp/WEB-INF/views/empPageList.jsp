<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
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

<form method="get" action="join">
	<input type="submit" value="사원 추가하기">
</form>

<form method="get" action="emp2">
사원번호를 입력하여 조회 : <input type="number" name="empno" value="null">
사원이름를 입력하여 조회 : <input type="text" name="ename">
<input type="submit" value="조회">
</form>

<form method="get" action="">
<select name="countPerPage">
	<option value="10">10개씩</option>
	<option value="20">20개씩</option>
	<option value="30">30개씩</option>
	<option value="40">40개씩</option>
	<option value="50">50개씩</option>
</select>
<input type="submit" value="조회">
</form>

<table border="1">
	<tr>
		<th>순번</th>
		<th>사원번호(empno)</th>
		<th>사원이름(ename)</th>
		<th>직책(job)</th>
		<th>사수(mgr)</th>
		<th>입사일(hireDate)</th>
		<th>급여(sal)</th>
		<th>성과금(comm)</th>
		<th>부서(deptno)</th>
	</tr>
	<c:if test="${ map.list.size() <= 0 }">
		<tr>
			<td colspan="4" style="text-align:center">조회된 결과가 없습니다.</td>
		</tr>
	</c:if>
	<c:if test="${ map.list.size() > 0 }">
	<c:forEach var="emp" items="${ map.list }">
		<tr>
			<td>${ emp.rnum }</td>
			<td>${emp.empno }</td>
			<c:url var="url1" value="read">
			<c:param name="empno" value="${ emp.empno }" />
			</c:url>
			<td><a href=${ url1 }>${emp.ename }</a></td>
			<td>${emp.job }</td>
			<td>${emp.mgr}</td>
			<td>${emp.hireDate}</td>
			<td>${emp.sal}</td>
			<td>${emp.comm}</td>
			<td>${emp.deptno}</td>
		</tr>
	</c:forEach>
	</c:if>
</table>
<%
	Map map = (Map)request.getAttribute("map");

	int totalCount = (int)map.get("totalCount");
	
	String str_countPerPage = (String)request.getAttribute("countPerPage");
	int countPerPage = Integer.parseInt(str_countPerPage);
	
	String str_pageNo = (String)request.getAttribute("page");
	int pageNo = Integer.parseInt(str_pageNo);
	
	int lastPage = (int)Math.ceil( (double)totalCount / (double)countPerPage );
	
	
%>
<c:set var="lastPage" value="<%= lastPage %>" scope="page"/>
<div>
	<a href="page?page=${ page - 1 }">이전</a>
	
	
		<c:forEach var="i" begin="1" end="${ lastPage }">
			<c:if test="${ i eq page }">
				<a href="page?page=${i}"><strong>[${i}]</strong></a>
			</c:if>
			<c:if test="${ !(i eq page) }">
				<a href="page?page=${i}">[${i}]</a>
			</c:if>
		</c:forEach>
	<a href="page?page=${ page + 1 }">다음</a>
</div>
</body>
</html>