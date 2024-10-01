<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax client side rendering</title>
<script>
	window.addEventListener("load",function(){
		
		const btn = document.querySelector("#btn");
		btn.addEventListener("click", function(){
			
			console.log("click!")
			
			const xhr = new XMLHttpRequest();
			const url = "human/test1";
			const data = {
					ename : "이름",
					sal : 3200 }
			
			xhr.open("POST", url, true)
			// json 타입으로 설정
			xhr.setRequestHeader("Content-Type","application/json");

			const strData = JSON.stringify(data);
			console.log(data); // 객체 그자체. 네트워크는 객체를 전달할수 없다.
			console.log(strData); // 그래서 json에서 지원하는 stringify 로 String 타입으로 변경.
			
			xhr.send(strData);
			
			xhr.onload = function() {
				console.log(xhr.responseText);
				
				try  {
					let result = JSON.parse(xhr.responseText);
					console.log(result);
					console.log(result.ename);
					console.log(result["ename"]);
				} catch(e) {
					console.log("No json");
					
				}
				
			} // xhr.onload END
			
		}) // btn.addEventListener END
	}) // window.addEventListener END
</script>
</head>
<body>
	<button id="btn">Ajax 실행</button>
</body>
</html>