<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ page import = "salePage.model.Sale" %>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
String path =  request.getContextPath();   
%>
<link href="<%=path%>/css/sale_list.css" rel="stylesheet">
</head>

<body>
<jsp:include page="/main/header.jsp"></jsp:include>
<jsp:include page="/main/nav.jsp"></jsp:include>
<section>

<%
ArrayList<Sale> list = (ArrayList<Sale>)request.getAttribute("list");
String total_price = (String)request.getAttribute("totalprice");
%>


<table>

<caption>
<h3>판매내역조회</h3>
</caption>

<tr class="f">
<td>주문번호</td>
<td>아이디</td>
<td>판매코드</td>
<td>상품코드</td>
<td>갯수</td>
<td>주문날짜</td>
</tr>

<%for (Sale sale: list)  {%>
<tr>
<td><%= sale.getOrder_number() %></td>
<td><%= sale.getId()%></td>
<td><%= sale.getSale_code() %></td>
<td><%= sale.getGoods_code() %></td>
<td><%= sale.getThe_number() %></td>
<td><%= sale.getSubOrder_date()%></td>
</tr>
<%} %>
</table>

<%if (total_price != null)  {%>
<span>총 매출: \ <%= total_price%></span>
<%} %>

</section>

<jsp:include page="/main/footer.jsp"></jsp:include>
</body>
</html>