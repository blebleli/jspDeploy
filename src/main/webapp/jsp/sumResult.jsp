<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	sumResult : <%= request.getAttribute("sumResult")%>
	
	<%
		HttpSession sess = request.getSession();
	
	
		//session.invalidate(); --접속한 사용자의 세선을 초기화
	%>
	
	기본객체 session sumResult : <%= session.getAttribute("sumResult") %>
	request 객체 session sumResult : <%= sess.getAttribute("sumResult") %>
	
	
	
</body>
</html>