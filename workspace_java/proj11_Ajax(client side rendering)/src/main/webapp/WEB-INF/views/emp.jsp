<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<header>
		Logo
		<nav>emp > 회원 목록</nav>
	</header>
	<main>
		<a href="emp0?cmd=join">회원가입</a>
		<section>
			<article>
				<form id="frm" method="get" action="emp0">
					<select name="searchType">
						<option value="1"
							${searchType == 1 ? " selected='selected' " : "" }>이름</option>
						<option value="2"
							${searchType == 2 ? " selected='selected' " : "" }>직책</option>
						<option value="3"
							${searchType == 3 ? " selected='selected' " : "" }>이름+직책</option>
						<option value="4"
							${searchType == 4 ? " selected='selected' " : "" }>연봉(이하)</option>
					</select> <input type="text" name="keyword" placeholder="검색어를 입력하세요"
						value="${keyword }"> <input type="submit" value="검색">


					<input type="hidden" name="orderType" value="${orderType }">
					<table border="1">
						<caption>회원 목록 표시 : display:none으로 감춰놓자</caption>
						<thead>
							<tr>
								<th>선택</th>
								<th id="empno">empno <c:if test='${orderType == "desc" }'>↓</c:if>
									<c:if test='${orderType eq "asc" }'>↑</c:if>
								</th>
								<th>ename</th>
								<th>job</th>
								<th>sal</th>
								<th>hireDate</th>
								<th>삭제</th>
							</tr>
						</thead>
						<tbody id="list">

						</tbody>
					</table>
				</form>
			</article>
		</section>
	</main>
	<footer>휴먼</footer>

	<script>
	window.addEventListener("load", function() {
		getList();
	});
	function ajax(url, param, cb, method) {
		if (!method) method = "get";
		const xhr = new XMLHttpRequest();
		xhr.open(method, url);
		
		if(param) {
			xhr.setRequestHeader("Content-Type", "application/json");
			const data = JSON.stringify(param);
			xhr.send(data);
		} else {
			xhr.send();
		}
		
		if(typeof cb == "function"){
			xhr.onload = function() {
				cb(xhr.responseText);
			}
			}
	}
	
	function getList() {
		ajax("listEmp", null ,drawList, "get")
	}
	
	function drawList(text) {
		try {
			const empList = JSON.parse(text);
			let html = "";
			for (let i = 0; i < empList.length; i++) {
				let timestamp = empList[i].hireDate;
				let dateObj = new Date(timestamp);

				let year = dateObj.getFullYear();
				let month = ("0" + (dateObj.getMonth() + 1)).slice(-2);
				let day = ("0" + dateObj.getDate()).slice(-2);

				let formattedDate = `\${year}년 \${month}월 \${day}일`;

				html += `
					<tr>
						<td>
							<input type='checkbox' name='check' value='${empList[i].empno}'>
						</td>
						<td>\${empList[i].empno}</td>
						<td>\${empList[i].ename}</td>
						<td>\${empList[i].job}</td>
						<td>\${empList[i].sal}</td>
						<td>\${formattedDate}</td>
						<td><button type="button" data-empno="\${empList[i].empno}" class="btnDel" id="btn_\${empList[i].empno}">삭제</button></td>
					</tr>`;
			} // for END
			
			document.querySelector('#list').innerHTML = html;
			
			bind();

		} catch(e) {
			console.log("JSON parsing ERROR: url:",e);
		} // try catch END
	}
	
	function bind() {
		const delBtnList = document.querySelectorAll(".btnDel");
		
		for (let btn of delBtnList) {
			btn.addEventListener("click", function(event) {
				let empno = event.target.getAttribute("data-empno");
				console.log("empno :",empno);
				
				const data = {
				        empno: empno
				    };
				
				ajax("delemp",data , function(result){
					if(result != 0 ) {
						getList();
					} else {
						alert("삭제 실패");
					}
				} , "delete")
				
			}) // btn.addEventListener END
		} // for END
	}
	// 원본
// 	window.addEventListener("load", function() {
// 		const xhr = new XMLHttpRequest();
// 		const url = "listEmp";
		
// 		xhr.open("get", url);
// 		xhr.send();

// 		xhr.onload = () => {
// 			console.log(xhr.responseText);
			
// 			let html = ""; // 누적된 HTML을 담을 변수
// 			try {
// 				const empList = JSON.parse(xhr.responseText);
// 				for (let i = 0; i < empList.length; i++) {
// 					// SQL에서 가져온 timestamp 값 (예: "2024-09-30 15:30:00")
// 					let timestamp = empList[i].hireDate;
					
// 					// timestamp를 Date 객체로 변환
// 					let dateObj = new Date(timestamp);

// 					// 원하는 형식으로 변환
// 					let year = dateObj.getFullYear();
// 					let month = ("0" + (dateObj.getMonth() + 1)).slice(-2); // 월은 0부터 시작하므로 +1
// 					let day = ("0" + dateObj.getDate()).slice(-2);

// 					// 최종 출력 포맷: "YYYY-MM-DD HH:MM:SS"
// 					let formattedDate = `\${year}년 \${month}월 \${day}일`;

// 					// HTML 누적
// 					html += `
// 						<tr>
// 							<td>
// 								<input type='checkbox' name='check' value='${empList[i].empno}'>
// 							</td>
// 							<td>\${empList[i].empno}</td>
// 							<td>\${empList[i].ename}</td>
// 							<td>\${empList[i].job}</td>
// 							<td>\${empList[i].sal}</td>
// 							<td>\${formattedDate}</td>
// 							<td><button type="button" data-empno="\${empList[i].empno}" class="btnDel" id="btn_\${empList[i].empno}">삭제</button></td>
// 						</tr>`;
// 				} // for END
				
// 				// 누적된 HTML을 테이블에 추가
// 				document.querySelector('#list').innerHTML = html;
				
// 				// [id^=btn_] : ^는 id가 btn_ 으로 시작하는 id값을 가져오는 방법중 하나이다.
// // 				const delBtnList = document.querySelectorAll("[id^=btn_]");
// 				const delBtnList = document.querySelectorAll(".btnDel");
				
// 				for (let btn of delBtnList) {
// 					btn.addEventListener("click", function(event) {
// // 						console.log(event.target)
// 						let empno = event.target.getAttribute("data-empno");
// 						console.log("empno :",empno);
// 						// 이 empno를 ajax로 전달하여 deleteEmp 하기

// 						const xhr2 = new XMLHttpRequest();
// 						const url2 = "delemp";
						
// 						xhr2.open("delete", url2);
// 						xhr2.setRequestHeader("Content-Type", "application/json");
// 						const data = {
// 						        empno: empno  // JSON 객체로 전달할 데이터
// 						    };

// 					    xhr2.send(JSON.stringify(data));
						
// 						xhr2.onload = () => {
// 					        if (xhr.status === 200) {
// 								console.log(xhr.responseText);
// 					            console.log("deleted successfully");
// 					            event.target.closest('tr').remove();
// 					        } else {
// 								console.log(xhr.responseText);
// 					            console.log("Error deleting employee:", xhr.statusText);
// 					        }
// 						}
						
// 					}) // btn.addEventListener END
// 				} // for END

// 			} catch(e) {
// 				console.log("JSON parsing ERROR: url:", url, e);
// 			} // try catch END
// 		} // xhr.onload END
// 	}); // window.addEventListener END

	
   document.querySelector("#empno").addEventListener("click", function(){
      const orderType = document.querySelector("[name=orderType]");
      
      // '' > 'desc' > 'asc' > '' 처럼 세개의 값을 순환하게 만들기
      console.log(orderType.value, orderType.value == '');
      if(orderType.value == ''){
         orderType.value = 'desc'
      } else if(orderType.value == 'desc'){
         orderType.value = 'asc'
      } else if(orderType.value == 'asc'){
         orderType.value = ''
      }
      
      const frm = document.querySelector("#frm");
      frm.submit();
      
   })

</script>

</body>
</html>





