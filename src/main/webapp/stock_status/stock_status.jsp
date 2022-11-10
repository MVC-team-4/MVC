<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 재고 현황</title>

<%
String path =  request.getContextPath();   
%>
<link href="<%=path%>/css/stock_status.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="<%=path%>/js/stock_status.js"></script>

</head>
<body>
    <div class="stock-wrap">
        <h2>상품 재고현황</h2>
        <table id="stock_tbl">
            <thead>
                <tr>
                    <th>No</th>
                    <th>종류</th>
                    <th>상품코드</th>
                    <th>상품명</th>
                    <th>재고</th>
                </tr>
            </thead>
            <tbody id="stock_tbody">
            </tbody>
        </table>
    </div>
</body>
</html>