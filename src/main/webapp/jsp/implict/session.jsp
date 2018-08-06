<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	sumResult : <%= request.getAttribute("sumResult")%> <br>
	
	HttpSession sess: <%HttpSession sess = request.getSession();%><br>
	
	기본    객체 session sumResult : <%= session.getAttribute("sumResult") %><br>
	request 객체 session sumResult : <%= sess.getAttribute("sumResult") %>
	
</body>
</html>