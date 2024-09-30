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
								<!--                   <th>삭제</th> -->
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
	
	window.addEventListener("load", function(){
		
		const xhr = new XMLHttpRequest();
		const url = "listEmp";
		
		xhr.open("get", url)
// 		xhr.setRequestHeader("Content-Type","application/json");
		xhr.send();
		
		xhr.onload = ()=> {
			console.log(xhr.responseText)
			
				let html = "";
			try{
				const empList = JSON.parse(xhr.responseText);
				for(let i=0; i<empList.length; i++){
					console.log(empList[i].ename)
					/*
					html += '<tr>';
			        html += '<td>';
			        html += '<input type="checkbox" name="check" value="${empList[i].empno}">';
			        html += '</td>';
			        html += '<td>${empList[i].empno}</td>';
			        html += '<td>${empList[i].ename}</td>';
			        html += '<td>${empList[i].job}</td>';
			        html += '<td>${empList[i].sal}</td>';
			        html += '<td>';
			        html += '<fmt:formatDate value="${empList[i].ename}" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초" />';
			        html += '</td> ';                   
		            html += '</tr>
					*/
					// SQL에서 가져온 timestamp 값 (예: "2024-09-30 15:30:00")
					let timestamp = empList[i].hireDate;
					console.log(timestamp)
					// timestamp를 Date 객체로 변환
					let dateObj = new Date(timestamp);

					// 원하는 형식으로 변환
					// 예: YYYY-MM-DD HH:MM:SS 형식
					let year = dateObj.getFullYear();
					let month = ("0" + (dateObj.getMonth() + 1)).slice(-2); // 월은 0부터 시작하므로 +1
					let day = ("0" + dateObj.getDate()).slice(-2);
					let hours = ("0" + dateObj.getHours()).slice(-2);
					let minutes = ("0" + dateObj.getMinutes()).slice(-2);
					let seconds = ("0" + dateObj.getSeconds()).slice(-2);

					// 최종 출력 포맷: "YYYY-MM-DD HH:MM:SS"
					let formattedDate = `\${year}-\${month}-\${day} \${hours}:\${minutes}:\${seconds}`;
					html = `
					<tr>
				        <td>
				        <input type='checkbox' name='check'>
				        </td>
				        <td>\${empList[i].empno}</td>
				        <td>\${empList[i].ename}</td>
				        <td>\${empList[i].job}</td>
				        <td>\${empList[i].sal}</td>
				        <td>`+formattedDate+`</td>
		            </tr>`;
					document.querySelector('#list').innerHTML += html;
				}
			} catch(e) {
				console.log("JSON parsing ERROR : url :", url, e);
			}
			
		}		
	})
	
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





