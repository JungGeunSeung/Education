<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:insertAttribute name="title" /></title>
<style>
	#side {
		display: inline-block;
		width: 30%;
		border: 1px solid green;
		
	}
	#content {
		display: inline-block;
		width: 69%;
		border: 1px solid black;
		
		
	}
</style>
</head>
<body>

<!-- Header -->
<div>
	<!-- 이전에 썼던 방식 -->
	<%-- <%@ import %> --%>
	<%-- <jsp:include page=""></jsp:include> --%>

	<!-- 
		해당 jsp를 가져온게 아니라 jsp의 위치가 할당되어 지어진 이름을 불러온다.
		
	 -->
	<tiles:insertAttribute name="header" />

</div>

<!-- Side -->
<div id="side">
	<tiles:insertAttribute name="side" />
</div>

<!-- Content -->
<div id="content">
	<tiles:insertAttribute name="content" />
</div>

<!-- Footer -->
<div>
	<tiles:insertAttribute name="footer" />
</div>
</body>
</html>