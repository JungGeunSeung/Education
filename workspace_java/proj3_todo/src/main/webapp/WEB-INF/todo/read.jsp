<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할일 관리 > 할일 상세</title>
</head>
<body>
	<div>${ dto.tno }</div>
	<div>${ dto.title }</div>
	<div>${ dto.dueDate }</div>
	<div>${ dto.finished }</div>
	<c:url var="list1" value="/todo/list">
	</c:url>
	<a href="${ list1 }">목록으로 돌아가기</a>
	<br>
	<c:url var="modify" value="/todo/modify">
		<c:param name="tno" value="${ dto.tno }" />
		<c:param name="title" value="${ dto.title }" />
		<c:param name="dueDate" value="${ dto.dueDate }" />
		<c:param name="finished" value="${ dto.finished }" />
	</c:url>
	<a href="${modify}" name="modify">수정하기</a>
	
	<form method="post" action="delete">
		<input type="hidden" name="tno" value="${dto.tno}">
		<input type="submit" value="삭제">
	</form>
</body>
</html>