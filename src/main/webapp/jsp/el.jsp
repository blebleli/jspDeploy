<%@page import="kr.or.ddit.student.model.StudentVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>request</h3>

표현식 : <%= request.getAttribute("requestScop") %> <br>
EL: ${requestScope.requestScop }<br>
EL: ${requestScop }<br>

<h3>session</h3>
표현식 : <%= session.getAttribute("sessionScop") %> <br>
EL: ${sessionScope.sessionScop }<br>
EL: ${sessionScop }<br>

<h3>application</h3>
표현식 : <%= application.getAttribute("applicationScop") %> <br>
EL: ${applicationScope.applicationScop }<br>
EL: ${applicationScop }<br>

<h3>sameName</h3>
EL: ${sameName } 어떤영역의 값을 가져오나?? -->가장 작은 영역에서부터 큰영역으로 검색<br>
	[작은] pageContext -> request -> session -> application [큰]
	
<h3>studentList</h3>	
표현식<br>
<table>
	<tr>
		<th>ID</th>	
		<th>NAME</th>	
		<th>CALL_CNT</th>	
	</tr>

	<% List<StudentVo> stdList = (List<StudentVo>)request.getAttribute("studentList");
	   for(StudentVo stdvo : stdList){
		  pageContext.setAttribute("vo",stdvo);
	%>	<tr>
			<td><%=stdvo.getName()%> </td>	
			<td><%=stdvo.getName() %></td>	
			<td><%=stdvo.getCall_cnt() %></td>	
		</tr>
	<%}%>
</table>

<br><hr><br>
EL : 
<table>
	<tr>
		<th>ID</th>	
		<th>NAME</th>	
		<th>CALL_CNT</th>	
	</tr>
<c:forEach items="${studentList}" var="vo">  <!--  items 루프할 대상-->
	<tr>
		<td>${vo.id}</td>
		<td>${vo.name}</td>
		<td>${vo.call_cnt}</td>
	</tr>
</c:forEach>	
</table>	
</body>
</html>