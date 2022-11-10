<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<% String path = request.getContextPath(); %>
<link href="<%=path %>/css/nav.css" rel= "stylesheet" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="<%=path %>/js/nav.js"></script>

</head>
<body>
	<nav>
        <div class="profile">
            <div class="nav-logo">
                <a href="#">
                    A
                </a>
            </div>
            <div class="store-name">
                <a href="#">ACORN LIQUOR</a>
            </div>
        </div>
        <ul class="nav-ul">
            <li class="li1">
                <a href="javascript:listClick1();">상품관리</a>
            </li>
            <ul class="nav-ul2 list1">
                <li>
                    <a href="/DrinkStoreManager/goods-reg.do">상품 등록</a>
                </li>
                <li>
                    <a href="/DrinkStoreManager/goods-list.do">상품 조회/수정</a>
                </li>
            </ul>
            <li class="li2">
                <a href="javascript:listClick2();">판매내역</a>
            </li>
            <ul class="nav-ul2 list2">
                <li>
                    <a href="/DrinkStoreManager/sale">전체 조회</a>
                </li>
                <li>
                    <a href="/DrinkStoreManager/datesale">날짜 검색</a>
                </li>
                <li>
                    <a href="/DrinkStoreManager/codesale">상품코드 검색</a>
                </li>
                <li>
                    <a href="/DrinkStoreManager/namesale">ID 검색</a>
                </li>
                <li>
                    <a href="/DrinkStoreManager/pricesale">날짜별 매출 조회</a>
                </li>
            </ul>
            <li class="li3">
                <a href="javascript:listClick3();">고객관리</a>
            </li>
            <ul class="nav-ul2 list3">
                <li>
                    <a href="/DrinkStoreManager/Customerlist">고객 조회</a>
                </li>
                <li>
                    <a href="/DrinkStoreManager/Customerupdate">고객 등급관리</a>
                </li>
            </ul>
        </ul>
    </nav>
</body>
</html>