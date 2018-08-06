<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.board.model.BoardVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	td,th{
		border : 1px solid green;
	}
</style>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>제목</th>
				<th>사용자 아이디</th>
				<th>별명</th>
				<th>등록일 (yyyy-MM-dd)</th>
			</tr>
			<tr>
				<%
				SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
					List<BoardVo> boardVo = (List<BoardVo>) session.getAttribute("boardVo");
					for (int i = 0; i < boardVo.size(); i++) {
				%>
				<td><%=boardVo.get(i).getTitle()%></td>
				<td><%=boardVo.get(i).getUserId()%></td>
				<td><%=boardVo.get(i).getAlias()%></td>
				<td><%=sf.format(boardVo.get(i).getRedDt())%></td>
			</tr>
				<%}%>

		</thead>
	</table>
</body>
</html>