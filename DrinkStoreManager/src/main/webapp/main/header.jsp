<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<% String id = (String)session.getAttribute("id"); %>
<% String path = request.getContextPath(); %>
<link href="<%=path %>/css/header.css" rel= "stylesheet" type="text/css">

</head>
<body>
    <header>
        <div class="header">
            <div class="header-title">
                <div class="logo">
                    <a href="#"> NEVER </a>
                </div>
                <div class="title-logo">
                    <a href="/DrinkStoreManager/main">스마트스토어센터</a>
                </div>
            </div>
            <div class="header-info">
                <div class="manager-id-logo">
                    <%= id %> 님
                </div>
                <div class="login-logo">
                    <a href="/DrinkStoreManager/logout">로그아웃</a>
                </div>
            </div>
        </div>
    </header>
</body>
</html>