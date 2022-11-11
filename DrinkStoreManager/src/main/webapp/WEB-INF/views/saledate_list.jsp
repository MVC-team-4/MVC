<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "salePage.model.Sale" %>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날짜별 판매내역 조회</title>
<%
String path =  request.getContextPath();   
%>
<link href="<%=path%>/css/sale_list.css" rel="stylesheet">
<link href="<%=path %>/css/section.css" rel= "stylesheet" type="text/css">
<script>
function find(){
	let date = document.getElementById("date");
	window.location.href="datesale?date="+ date.value;
}
</script>
</head>
<body>
<jsp:include page="/main/header.jsp"></jsp:include>
<jsp:include page="/main/nav.jsp"></jsp:include>
<%
ArrayList<Sale> list = (ArrayList<Sale>)request.getAttribute("list");
%>

<section>
<table>

<caption>
<h3>날짜별 조회</h3>
날짜: <input type="text" id="date" placeholder="0000-00-00">
<button onclick="find()">검색</button>
</caption>

<tr class="f">
<td>주문날짜</td>
<td>주문번호</td>
<td>아이디</td>
<td>판매코드</td>
<td>상품코드</td>
<td>갯수</td>
</tr>

<%for (Sale sale: list)  {%>
<tr>
<td><%= sale.getSubOrder_date() %></td>
<td><%= sale.getOrder_number() %></td>
<td><%= sale.getId()%></td>
<td><%= sale.getSale_code() %></td>
<td><%= sale.getGoods_code() %></td>
<td><%= sale.getThe_number() %></td>
</tr>
<%} %>
</table>
</section>

<jsp:include page="/main/footer.jsp"></jsp:include>
</body>
</html>