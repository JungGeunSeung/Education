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
	<div>${ dto.tno }</div>
	<div>${ dto.title }</div>
	<div>${ dto.dueDate }</div>
	<div>${ dto.finished }</div>
	<c:url var="list1" value="/todo/list">
	</c:url>
	<a href="${ list1 }">목록으로 돌아가기</a>
</body>
</html>