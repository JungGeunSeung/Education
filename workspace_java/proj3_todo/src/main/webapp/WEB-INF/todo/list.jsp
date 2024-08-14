<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 	<h1>List Page</h1> -->
<%-- 	${ list1 } --%>
<!-- 	<hr> -->
<%-- 	${ list1[0] } --%>
<!-- 	<hr> -->
<%-- 	${ list1[0].title } --%>
<!-- 	<hr> -->
<%-- 	${ list1[0]["title"] } --%>
<!-- 	<hr> -->
<%-- 	123${ null }456  <!-- null 은 출력 되지 않기 때문에, 브라우저에 표시가 되지 않았다면 null을 의심해야 한다. --> --%>
<style>
	div {
	border: 1px solid red;
	height: 30px;
	margin: 5px;
	padding-left: 5px;
	}
	
	a {
	text-decoration: none;
	color: black;
	}
</style>
	<div>
		<a href="/proj3_todo/todo/register">새 할일 작성</a>
	</div>
	<c:forEach var="todoDTO" items="${list1}">
		<div>
			<c:url var="url1" value="/todo/read">
			<c:param name="tno" value="${ todoDTO.tno }" />
			</c:url>
			<a href="${ url1 }">상세보기</a>
			 순번 : ${todoDTO.tno }, 제목 : ${ todoDTO.title}, 시간 : ${ todoDTO.dueDate }
		</div>
	</c:forEach>
</body>
</html>