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
<header>
	Logo
	<% String cmd = request.getParameter("cmd"); %>
	<% if(cmd.equals("join")) {%>
	<nav><h1>회원가입</h1></nav>
	<%} %>
	<% if(cmd.equals("adit")) {%>
	<nav><h1>회원수정</h1></nav>
	<%} %>
</header>
<main>
	<section>
		<article>
			<% if(cmd.equals("join")) {%>
				<form method="post" action="/proj6_myBatis/Emp0">
					empno : <input type="text" name="empno"><br>
					ename : <input type="text" name="ename"><br>
					job : <input type="text" name="job"><br>
					<input type="hidden" name="cmd" value="${ cmd }">
					<input type="submit" value="가입하기">
				</form>
			<%} %>
			<% if(cmd.equals("adit")) {%>
				<form method="post" action="/proj6_myBatis/Emp0">
					empno : <input type="number" name="empno" value="${ dto.empno }"><br>
					ename : <input type="text" name="ename" value="${ dto.ename }"><br>
					job : <input type="text" name="job" value="${ dto.job }"><br>
					<input type="hidden" name="cmd" value="${ cmd }">
					<input type="submit" value="수정하기">
				</form>
			<%} %>
		</article>
	</section>
</main>
<footer>휴먼교육센터</footer>
</body>
</html>