<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="http://localhost:8080/Quiz/stylesheet.css">
<title>ログイン</title>
</head>
<body>
    <div id="login">
<form action="/Quiz/LoginServlet" method="post">
ユーザー名:<input type="text" name="userName"><br>
パスワード:<input type="password" name="pass"><br>
<input type="submit" value="ログイン">
</form>
    </div>
</body>
</html>