<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>calc input</title>
</head>
<body>
	<!-- 
	action의 기본값 : 내 주소
	method의 기본값 : get 방식
	 -->
<!-- 	<form>
		<input type="number" name="num1">
		<input type="number" name="num2">
		<button type="submit">SEND</button>
	</form> -->
	
	<!-- 주소가 /로 시작하면 처음나오는 / , 즉 포트 뒤 에 있는 모든 주소를 바꾼다. -->
	<!-- /가 없으면 상대주소로 내가 위치해있던 폴더가 다르면 결과도 달라진다. 마지막 /로 시작하는곳을 바꾼다. -->
	<form action="/proj2_calc/calc/makeResult" method="post">
		<input type="number" name="num1">
		<input type="number" name="num2">
		<button type="submit">SEND-post</button>
	</form>
	<form action="/proj2_calc/calc/makeResult" method="get">
		<input type="text" name="text1" value="text2"> <br>
		<!-- 버튼은 null로 넘어온다. -->
		<input type="button" name="btn1" value="btn2"> <br>
		<button type="button" name="btn2" value="btn3">버튼2</button><br>
		<input type="password" name="pw1" value="pw2"> <br>
		<input type="hidden" name="hidden1" value="hidden2"><br>
		
		<input type="radio" name="radio1" value="radio2">radio2<br>
		<input type="radio" name="radio1" value="radio3">radio3<br>
		
		<!-- 체크박스의 네임이 같다면 중복으로 체크해도 맨 위에 있는 value값만 넘어가게 된다. -->
		<input type="checkbox" name="chk1" value="chk2">check2<br>
		<input type="checkbox" name="chk1" value="chk3">check3<br>
		<input type="checkbox" name="chk1" value="chk4">check4<br>
		
		<input type="date" name="date1"><br>
		
		<!-- 디스플레이 숨긴것도 함께 넘어간다. -->
		<input type="text" name="text2" value="text3" style="display:none;"><br>
		
		<select name="select1">
			<option value="op1">option1</option>
			<option value="op2">option2</option>
			<option value="op3">option3</option>
			<option value="op4">option4</option>
		</select>
		
		<textarea name="textarea1">초기값
		엔터
		엔터</textarea> <br>
		
		
		
		<button type="submit">SEND-post</button>
	</form>
</body>
</html>