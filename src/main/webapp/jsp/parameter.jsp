<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- jsp 기본객체(암묵적객체, 묵시적 객체, implict object 
	requestm response
--%>

<%
//인자값 :  파라미터 이름 
//userId : 파라미터에 대한 값

String userId = request.getParameter("userId");
String userPass = request.getParameter("userPass");
String[] userIds = request.getParameterValues("userId");
Map<String, String[]> requestMap  = request.getParameterMap();
String[] mapUserIds = requestMap.get("userId");

Enumeration enumeration = request.getParameterNames();

%>


userId : <%=userId %> 	 <br>
userPass : <%=userPass %><br>


<h3>getParameterValues</h3>
<%for(String st : userIds){%>
	userIds : <%=st %><br>
<%}%>


<h3>getParameterMap</h3>
<%for(String st : mapUserIds){%>
	userIds : <%=st %><br>
<%}%>

<h3>getParameterNames</h3>
<%while(enumeration.hasMoreElements()){
	String parameterName = (String)enumeration.nextElement();
}
%>





</body>
</html>