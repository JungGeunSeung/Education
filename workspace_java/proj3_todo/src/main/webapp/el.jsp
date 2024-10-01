<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	\${ 10 + 1 } : ${ 10 + 1 }<br>
	\${ "10" + 1 } : ${ "10" + 1 } - el은 계산할때 문자를 숫자로 바꿔서 계산한다<br>
	<%-- \${ "a" + 1 } : ${ "a" + 1 } --%> <!-- 따라서 문자를 숫자로 바꿔서 연산하려하기 때문에 에러가 난다. -->
	\${ null + 1 } : ${ null + 1 } <br>
	
	\${ 10 / 3 } : ${ 10 / 3 } <br>
	\${ 10 div 3 } : ${ 10 div 3 } <br>
	
	\${ 10 % 3 } : ${ 10 % 3 } <br>
	\${ 10 mod 3 } : ${ 10 mod 3 } <br>
	<hr>
	\${ 10 == 10 } : ${ 10 == 10 } <br>
	\${ "10" == "10" } : ${ "10" == "10" } <br>
	\${ "10" eq "10" } : ${ "10" eq "10" } <br>
	
	\${ 10 != 10 } : ${ 10 != 10 } <br>
	\${ 10 ne 10 } : ${ 10 ne 10 } <br>
	
	\${ 100 > 10 } : ${ 100 > 10 } <br>
	\${ 100 gt 10 } : ${ 100 gt 10 } <br>
	
	\${ 100 < 10 } : ${ 100 < 10 } <br>
	\${ 100 lt 10 } : ${ 100 lt 10 } <br>
	
	\${ 100 >= 10 } : ${ 100 >= 10 } <br>
	\${ 100 ge 10 } : ${ 100 ge 10 } <br>

	\${ 100 <= 10 } : ${ 100 <= 10 } <br>
	\${ 100 le 10 } : ${ 100 le 10 } <br>

	\${ (100 gt 10) eq "true" } : ${ (100 gt 10) eq "true" } - (100 gt 10)은 문자로 반환된다
	<hr>
	
	\${ (100 gt 10) && (100 gt 10) } : ${ (100 gt 10) && (100 gt 10) } <br>
	\${ (100 gt 10) and (100 gt 10) } : ${ (100 gt 10) and (100 gt 10) } <br>
	
	\${ (100 gt 10) || (100 gt 10) } : ${ (100 gt 10) || (100 gt 10) } <br>
	\${ (100 gt 10) or (100 gt 10) } : ${ (100 gt 10) or (100 gt 10) } <br>
	
	\${ !(100 gt 10) } : ${ !(100 gt 10) } <br>
	\${ not(100 gt 10) } : ${ not(100 gt 10) } <br>
	<hr>
	출력할 문자가 <strong>있으면</strong> empty는 false <br>
	출력할 문자가 <strong>없으면</strong> empty는 true (공백과 null 도 포함) <br>
	\${ empty "글씨" } : ${ empty "글씨" } <br> 
	\${ empty null } : ${ empty null } <br> 
	\${ empty "" } : ${ empty "" } <br> 
	<hr>
	\${ param.a } : ${ param.a }<br> <!-- key인 a를 가져 온다. 만약 값이 두개 이상일 경우 첫번째 값만 가져온다. -->
	\${ paramValues.a } : ${ paramValues.a }<br> <!-- key인 a의 value를 가져온다. values 이기때문에 배열로 가져 와서 배열을 참조하는 주소가 출력된다. -->
	\${ paramValues.a[0] } : ${ paramValues.a[0] }<br> <!-- a의 인덱스로 출력할수 있다. -->
	\${ paramValues.a[1] } : ${ paramValues.a[1] }<br>
	\${ paramValues.a[100] } : ${ paramValues.a[100] }<br> <!-- 인덱스를 넘어가는 숫자는 출력 되지 않는다. -->





</body>
</html>