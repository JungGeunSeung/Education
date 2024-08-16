<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할일 관리 > 할일 작성</title>
<style>
	a {
	text-decoration: none;
	color: black;
	}
</style>
</head>
<body>

	<form method="post" action="register">
		title : <input type="text" name="title" placeholder="제목"><br>
		duedate : <input type="date" name="dueDate" id="duedate"><br>		
		finished : 
			<input type="radio" name="finished" value="N" checked="checked"> 미완료
			<input type="radio" name="finished" value="Y"> 완료 <br>
	<input type="submit" value="작성하기">
	</form>

	
</body>
<script>
	function getTodayDate() {
	    let today = new Date();
	    console.log(today);
	    let year = today.getFullYear();
	    console.log(year);
	    let month = String(today.getMonth() + 1).padStart(2, '0'); // 월은 0부터 시작하므로 +1
	    console.log(month);
	    let day = String(today.getDate()).padStart(2, '0');
	    console.log(day);
	    return `\${year}-\${month}-\${day}`;
	}
	
	document.querySelector('#duedate').value = getTodayDate();
</script>
</html>