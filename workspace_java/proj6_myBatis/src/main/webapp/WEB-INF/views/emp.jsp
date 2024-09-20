<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
	<section>
		<article>
			<a href="Emp0?cmd=join">회원가입</a>
			<form id="frm" method="get" action="Emp0">
				<select name="type">
					<option value="1" ${ type == 1 ? 'selected="selected"' : '' }> 이름 </option>
					<option value="2" ${ type == 2 ? 'selected="selected"' : '' }> 직책 </option>
					<option value="3" ${ type == 3 ? 'selected="selected"' : '' }> 이름 + 직책 </option>
					<option value="4" ${ type == 4 ? 'selected="selected"' : '' }> 연봉(이하) </option>
				</select>
				검색 : <input type="text" name="keyword" placeholder="검색어를 입력하세요">
				<input type="submit" value="검색">
				<input type="hidden" name="orderType" value="${ orderType }">
				<input type="hidden" name="orderName">
				<table border="1">
					<caption>회원 목록 표시</caption>
					<thead>
						<tr id="selectTh">
							<th>선택</th>
							<th id="empno" >empno</th>
							<th>ename</th>
							<th>job</th>
							<th>hireDate</th>
							<th>sal</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="list" items="${ empList }">
						<tr>
						<c:url var="empno" value="Emp0?cmd=adit">
							<c:param name="empno" value="${ list.empno }"/>
							<c:param name="ename" value="${ list.ename }"/>
							<c:param name="job" value="${ list.job }"/>
						</c:url>
							<td>
								<input type="checkbox" name="check" value="${ list.empno }">
							</td>
							<td><a href="${ empno }">${ list.empno }</a></td>
							<td>${ list.ename }</td>
							<td>${ list.job }</td>
							<td>
							<!-- 원하는 형태로 날짜를 정할수 있다. -->
							<fmt:formatDate value="${ list.hireDate }" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초" />
							</td>
							<td>${ list.sal }</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
			</form>
		</article>
	</section>
</main>
<footer>휴먼교육센터</footer>

<script>
// 	document.querySelector('#empno').addEventListener('click', function(){
// 		const orderType = document.querySelector('[name=orderType]');
		
// 		// ''> 'desc' > 'asc' 로 세개의 값을 순환하게 만들기
// 		console.log("value : ",orderType.value, " bool : ",orderType.value == '')
// 		if(orderType.value == '') {
// 			orderType.value = 'desc'
// 		} else if (orderType.value == 'desc') {
// 			orderType.value = 'asc'
// 		} else if (orderType.value == 'asc') {
// 			orderType.value = ''
// 		}
		
// 		const frm = document.querySelector('#frm');
// 		frm.submit();
// 	})
	
	const tableTh = document.querySelectorAll('table th');
	
	tableTh.forEach(th => {
        th.addEventListener('click', function() {
        	const orderType = document.querySelector('[name=orderType]');
            const orderName = document.querySelector('[name=orderName]');
            orderName.value = th.innerText;
            console.log(orderName.value)
            if(orderType.value == '') {
    			orderType.value = 'desc'
    		} else if (orderType.value == 'desc') {
    			orderType.value = 'asc'
    		} else if (orderType.value == 'asc') {
    			orderType.value = ''
    		}
    		
    		const frm = document.querySelector('#frm');
    		frm.submit();
            
        });
    });
	
	
</script>

</body>

</html>