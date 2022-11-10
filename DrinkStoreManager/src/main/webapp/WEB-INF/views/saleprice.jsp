<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "salePage.model.Sale" %>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<%
String path =  request.getContextPath();   
%>
<link href="<%=path%>/css/sale_list.css" rel="stylesheet">
<script>
function find(){
	let date = document.getElementById("day");
	window.location.href="pricesale?day="+ day.value;
}
</script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<%
ArrayList<Sale> list = (ArrayList<Sale>)request.getAttribute("list");
String total_price = (String)request.getAttribute("totalprice");
%>

<section>
<table>

<caption>
<h3>판매금액</h3>
날짜 : <input type="text" id="day">
<button onclick="find()">검색</button>
</caption>

<tr class="f">
<td>주문날짜</td>
<td>주문번호</td>
<td>상품코드</td>
<td>갯수</td>
<td>금액</td>
<td>총 금액</td>
</tr>

<%for (Sale sale: list)  {%>
<tr>
<td><%= sale.getSubOrder_date() %></td>
<td><%= sale.getOrder_number() %></td>
<td><%= sale.getGoods_code() %></td>
<td><%= sale.getThe_number() %></td>
<td><%= sale.getPrice() %></td>
<td><%= sale.getSumPrice()%></td>
</tr>
<%} %>
</table>
  
<%if (total_price != null)  {%>
<span>총 매출: \ <%= total_price%></span>
<%} %>
 
</section>

</body>
</html>