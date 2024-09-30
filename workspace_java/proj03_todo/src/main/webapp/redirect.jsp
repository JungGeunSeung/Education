<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Redirect </title>
</head>
<body>
Redirect 도 적은 html은 안보인다.
<c:redirect url="jstl.jsp">
	<c:param name="name" value="이름" />
</c:redirect>
</body>
</html>