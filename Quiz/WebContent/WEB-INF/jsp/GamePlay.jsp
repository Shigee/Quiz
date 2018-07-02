<%@page import="java.util.ArrayList, model.GameData" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% ArrayList<ArrayList<GameData>> gameData = (ArrayList<ArrayList<GameData>>) session.getAttribute("gameData"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ゲーム画面</title>
</head>
<body>
<script>
</script>
<p><c:out value="${userName}" />さん</p>
<a href="/Quiz/LoginServlet">ログアウト</a>

<p>Q<span></span>/10</p>
<p><!-- 難易度 --></p>
<p><!-- 問題文 --></p>

<div class="main">
      <p class="button hvr-grow" id="maru">
        <input type="button" value="○" onclick="btn_click()">
      </p>
      <p class="button hvr-grow" id="batsu">
        <input type="button" value="×" onclick="btn_click()">
      </p>
    </div>
<p><!-- 終了 --></p>
</body>
</html>