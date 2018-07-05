<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"  href="${pageContext.request.contextPath}/toppage.css">
<link href="css/hover-min.css" rel="stylesheet" media="all">
<meta charset="UTF-8">
<title>トップページ</title>
</head>
<body>
    <h1 class="ml11">
        <span class="text-wrapper">
            <span class="line line1"></span>
            <span class="letters">Secure Life</span>
        </span>
    </h1>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<p>説明</p>
<a class="button hvr-grow-shadow" onclick="location.href='/Quiz/GameServlet?action=start'"> ゲームスタート</a>

<a href="#" class="button hvr-grow-shadow">ランキング</a>
</body>
</html>
