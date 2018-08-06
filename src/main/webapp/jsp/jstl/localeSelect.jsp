<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
</head>
<body>


<!-- select 박스 만들기 -->
<!-- parameter로 전송하려면 name 속성이 필요하다. -->

<select  id="lang" name="lang">
	<option value="ko">한국어</option>
	<option value="ja">日本語</option>
	<option value="en">English</option>
</select>

<!-- select 박스에서 값을가져와서 주소 지정하기  -->
<script>
$(function(){
	$('#lang').change(function(){
		var langu = $("#lang option:selected").val();
		location.href="/localeSelect?lng="+langu;
	});
});
</script>

<c:set var="userId" value="bleble"/>

<fmt:setLocale value="${lngg}"/> <!-- lngu은 servlet에서 보내준것 -->
<fmt:bundle basename="kr.or.ddit.msg.msg">
	<fmt:message key="hello"/><br>
	<fmt:message key="visitor">
		<fmt:param value="${userId}"/>
	</fmt:message>
</fmt:bundle>

</body>
</html>