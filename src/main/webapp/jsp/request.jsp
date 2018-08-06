<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 스크립틀릿 에서는 자바코드를 작성할 수 있다. --%>
<%
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//jsp 기본객체 : request, response
// request 는 선언하지 않았는데 불러오는것이 가능.

%>

request.getLocalAddr()  : 			<%= request.getLocalAddr()  %>         <br>
request.getLocalPort()  : 		    <%= request.getLocalPort()  %>         <br>
request.getRemoteAddr() :           <%= request.getRemoteAddr() %>         <br>
request.getRemoteHost() :           <%= request.getRemoteHost() %>         <br>
request.getRemotePort() :           <%= request.getRemotePort() %>         <br>
request.getCharacterEncoding() :    <%= request.getCharacterEncoding() %>  <br>
request.getContentType() :          <%= request.getContentType()%>         <br>
request.getContextPath() :          <%= request.getContextPath()%>         <br>
request.getRequestURL()  :          <%= request.getRequestURL() %>         <br>
request.getRequestURI()  :          <%= request.getRequestURL() %>         <br>
request.getServerName()  :          <%= request.getRequestURI() %>         <br>
request.getMethod()      :          <%= request.getServerPort() %>         <br>
                                        
</body>
</html>