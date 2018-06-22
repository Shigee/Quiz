<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ゲーム画面</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/gameFunction.js"></script>
</head>
<body>
<p><c:out value="${userName}" />さん</p>
<a href="/Quiz/LoginServlet">ログアウト</a>
<p>Q<span id="count"></span>/10</p>
<div class="main">
      <p class="button hvr-grow" id="maru">
        <input type="button" value="○" onclick="btn_click()">
      </p>
      <p class="button hvr-grow" id="batsu">
        <input type="button" value="×" onclick="btn_click()">
      </p>
    </div>
<p id="end"></p>
</body>
</html>