<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	//jsp기본객체: request response session out application
	//config
	//pageContext : 다른 댇체에 대한 전반적인 정보를 갖고 있습니다.	
	
	pageContext.getRequest(); //request 기본객체와 비교

	//application -->
	pageContext.getServletContext(); // application
	pageContext.getSession();		 // session
	pageContext.getOut();			 // out
	
%>
	pageContext.getRequest() == request : <%=request.equals(pageContext.getRequest())            %> <br>
	pageContext.getServletContext()     : <%=application.equals(pageContext.getServletContext()) %> <br>
	pageContext.getSession()	        : <%=session.equals(pageContext.getSession())	        %> <br>
	pageContext.getOut()	            : <%=out.equals(pageContext.getOut())	         %> <br>
	
</body>
</html>