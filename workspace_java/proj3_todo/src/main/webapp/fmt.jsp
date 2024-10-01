<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Date" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fmt</title>
</head>
<body>
new Data() : <%= new Date() %>
<hr>

<fmt:formatDate value="<%= new Date() %>" pattern="yyyy년 MM월 dd일 a hh:mm:ss" />
</body>
</html>