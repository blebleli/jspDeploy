<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%-- jstl 사용을 하기위해 taglic 지시자 작성 --%>
   <%--  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- localhost:8180/jstlServlet --%>
request.userId : ${userId } / ${requestScope.userId} <br>

<!-- 특정 영역에 변수를 새로 생성(default : page) -->

<!--1-->
<%
	pageContext.setAttribute("test","testValue");
%>

<!--2-->
c:set : <c:set var="test" value="testValue"/>${test } <br>

<!--3-->
pageContext.getAttribute("test") : <%=pageContext.getAttribute("test")%> 

<!--4 : 같은var에 value 를 지정해본다-->
<h3>c:set Scope</h3>
<c:set var="test" value="testSettionValue" scope="session"/>
${test } / ${sessionScope.test } <br>

<!--el은 영역이 작은 곳 부터 큰곳으로 순차검색
	page - > request ->session -> applocation
-->

<h3>c:set target, property</h3>
first     : ${studentVo }<br>

<c:set target="${studentVo }" property="name" value="bleble"/>
after set : ${studentVo }
</body>
</html>