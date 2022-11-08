<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "model.Sale" %>
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
</head>

<body>
<jsp:include page="header.jsp"></jsp:include>
<section>

<%
ArrayList<Sale> list = (ArrayList<Sale>)request.getAttribute("list");
%>


<table>

<caption>
<h2>판매내역조회</h2>
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

</section>
</body>
</html>