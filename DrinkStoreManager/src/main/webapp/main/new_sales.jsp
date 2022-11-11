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
<link href="<%=path%>/css/new_sales.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="<%=path%>/js/new_sales.js"></script>

</head>
<body>

    <h3>신규 주문</h3>
    <table id="newsale_tbl">
        <thead>
            <tr>
                <th>판매코드</th>
                <th>종류</th>
                <th>상품명</th>
                <th>개수</th>
            </tr>
        </thead>
        <tbody id="newsale_tbody">
            
        </tbody>
        
    </table>
</body>
</html>