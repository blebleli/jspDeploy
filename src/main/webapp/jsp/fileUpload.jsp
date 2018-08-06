<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 파일전송을위해 enctype="multipart.form-data"로 지정 -->
	<form action="/fileUpload" method="post" enctype="multipart/form-data">
	<input type="text" name="userId" value="bleble"><br>
	<input type="file" name="uploadFile"><br>
	<input type="submit" value="전송">
	</form>

</body>
</html>