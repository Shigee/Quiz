<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"  href="${pageContext.request.contextPath}/stylesheet.css">
<meta charset="UTF-8">
<title>新規登録</title>
</head>
<body>
	<div id="login">
<form action="/Quiz/EntryServlet" method="post">
新しいユーザー名:<input type="text" name="userName"><br>
新しいパスワード:<input type="password" name="pass"><br>
<input type="submit" value="作成" id="new_submit">
</form>
</div>
</body>
</html>