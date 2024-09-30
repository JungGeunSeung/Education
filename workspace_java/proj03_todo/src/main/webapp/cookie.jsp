<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookie.jsp</title>
<style>
	.popup {
		width: 200px;
		height: 500px;
		border: 1px solid black;
	}
	
	.hide {
		display: none;
	}

</style>
</head>
<body>

<div class="popup">
공지사항입니다. <br>

<input type="checkbox" id="popupShow">10초 동안 보이지 않기

</div>

</body>

<script>
	// 자바 스크립트로 쿠키 제어하기
	popupNoShow();
	function popupNoShow(){
		// 모든 쿠키 가져오기 (String으로 가져온다)
// 		console.log(document.cookie)
		// 		
		const aCookie = document.cookie.split("; ");
			for(let i =0; i<aCookie.length; i++) {
				const cookie = aCookie[i].split("=")
				const name = cookie[0];
				const value = cookie[1];
				
				console.log(aCookie[i]);

				if(name == "popupnoShow" && value == "true") {
					document.querySelector(".popup").classList.add("hide");
				}
			}
	}

	document.querySelector("#popupShow").addEventListener('click',function(event){
		let checked = event.target.checked;
		console.log("체크여부 : " + checked);
		document.cookie = 'a=a1';
		document.cookie = 'b=b1';
		// console.log(document.cookie)
		console.log(new Date())

		if(checked){
			// 10초 뒤 시간 가져오기
			const now = new Date(); // 현재시간
			console.log(now.toGMTString());
			// 지금 시간의 초를 가져오기
			const after_10s = now.getSeconds() + 10; // 10초 뒤 시간
			now.setSeconds(after_10s); // 초단위 재설정
			console.log(now.toGMTString());
	
			document.cookie = "popupnoShow=true; expires=" + now.toGMTString();
			
		}


	})

</script>
</html>