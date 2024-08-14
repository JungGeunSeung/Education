<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할일 관리 > 할일 수정</title>
<style>
	a {
	text-decoration: none;
	color: black;
	}
</style>
</head>
<body>

	<form method="post" action="modify">
		<input type="hedden" name="tno" value="${dto.tno}">
		title : <input type="text" name="title" placeholder="제목" value="${dto.title}"><br>
		dueDate : <input type="date" name="dueDate" id="duedate" value="${dto.dueDate}"><br>
		finished : 
			<input type="radio" name="finished" value="N" checked="checked"> 미완료
			<input type="radio" name="finished" value="Y"> 완료 <br>
	<input type="submit" value="글 수정하기">
	</form>
</body>
</html>