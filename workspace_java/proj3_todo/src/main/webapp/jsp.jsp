<!-- 디렉티브 태그 -->
<!-- import는 여러개 할 수 있다 -->
<!-- 안에 넣어도 되고 따로 빼도 된다 -->
<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.List"
    %>
<%@ page import="java.util.ArrayList" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 스크립틀릿 : 자바 영역 -->
<%
// 여기는 java 땅입니다.
System.out.println("test");
%>
<table border="1">

<%
for(int i=0; i<5; i++) {
%>
	<tr>
		<td>제목</td>
		<td>내용</td>
	</tr>
<% } %>

</table>
<%
	out.println("<h1>hello</h1>");
%>

<%
for(int i=0; i<5; i++) {
	out.println( i + "번째<br>");
}
%>

<%
	int a = 10;
	request.setAttribute("b", 123);
%>
el은 scope영역과 파라메터의 값만 가져올 수 있다<br>
el은 java 변수를 가져올 수는 없다<br>
a의 값 \${a } : ${a }<br>

<!-- 표현식 -->
<%= a %><br>
<%
out.print( a );
%>

<hr>

<%
	out.print( request.getAttribute("b") );
%><br>
<%= request.getAttribute("b") %><br>
${b }<br>

<%
	java.util.List list = new ArrayList();
%>

<hr>

<!-- 디렉티브 태그  -->
<%@ include file="header.jsp" %>

<%! // 선언태그
	// 선언문
	// 필드 선언
	String str = "글씨"; // 필드 영역으로 올라간다.
	// 메소드 선언
	String getStr(){
		return this.str;
	}
%>
<!-- 자바 액션태그 -->
<jsp:include page="header.jsp">
	<jsp:param name="id" value="정근승"></jsp:param>
</jsp:include>

</body>
</html>




