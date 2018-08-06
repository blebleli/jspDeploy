<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	td{
		border : 1px solid green;
	}
</style>
</head>
<body>

<table>
<%-- %안에 표현식이 들어올 수 없다. 자바 코드만 가능 --%>
<%for (int i = 2; i <10; i++) {%>
	<tr>
	<%for (int j = 1; j<10; j++) {%>
	<td><%=i+"*"+j+"="+(i*j) %></td>
	<%}%>
</tr>
<% }%>
</table>

</body>
</html>