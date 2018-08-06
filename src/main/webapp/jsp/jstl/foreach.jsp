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
<style>

	td{border : 1px solid #ea8685;}
	th{background : #e66767;}
	
</style>
</head>
<body>
<%--
	<table>
		<tr>
			<th>학생 아이디</th>
			<th>학생 이름</th>
			<th>지명 횟수</th>
		</tr>
		<c:forEach items="${studentList}" var="vo">
			<tr>
				<td>${vo.id}</td>
				<td>${vo.name}</td>
				<td>${vo.call_cnt}</td>
			</tr>
		</c:forEach>
	</table>
 --%>	
 
 	<table>
		<tr>
			<th>학생 아이디</th>
			<th>학생 이름</th>
			<th>지명 횟수</th>
		</tr>
		<c:forEach items="${studentList}" var="vo" begin="1" end="25" step="2" varStatus="status">
		<%--index는0부터 시작한다. step은 단계 --%>
			<tr>
				<td>${vo.id} / ${status.index}</td>
				<td>${vo.name}</td>
				<td>${vo.call_cnt}</td>
			</tr>
		</c:forEach>
	</table>
	<br>
<hr>	
<h3>foreach map</h3>	
	<%-- map에 있는 값들을 전부 조회해서 출력 --%>
	<c:forEach items="${map }" var="entry">
		${entry.key } / ${entry.value } <br>
	</c:forEach>
	
	
<h3>forTokens</h3>
	<c:forTokens items="${lineRangers }" delims="," var="ranger">
		${ranger }<br>
	</c:forTokens>	
	
	
</body>
</html>