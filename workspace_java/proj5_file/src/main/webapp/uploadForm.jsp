<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>uploadform</title>
</head>
<body>
<!-- 파일업로드는 무조건 post 방식으로 보내야 한다.
 	 enctype="multipart/form-data" : 멀티파티 방식으로 보내야 서버에서 읽을 수 있다. 
 	 원래 enctype 에 한글깨짐 방지를 적어주지만, 이 경우에는 accept-charset="utf-8" 를 추가로 적어준다. 
-->
	<form method="post" action="upload.do" enctype="multipart/form-data" accept-charset="utf-8">
		제목 : <input type="text" name="title"><br>
		내용 : <input type="text" name="content"><br>
		첨부파일 : <input type="file" name="file1"><br>
		<input type="submit" value="등록">
	</form>
	
	<img src="download.do?fileName=a.jpg">
</body>
</html>