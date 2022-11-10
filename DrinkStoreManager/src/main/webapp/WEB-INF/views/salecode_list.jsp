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
	let date = document.getElementById("code");
	window.location.href="codesale?code="+ code.value;
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
<h3>상품코드별 조회</h3>
상품코드 : <input type="text" id="code">
<button onclick="find()">검색</button>
</caption>

<tr class="f">
<td>상품코드</td>
<td>주문번호</td>
<td>아이디</td>
<td>판매코드</td>
<td>갯수</td>
<td>주문날짜</td>
</tr>

<%for (Sale sale: list)  {%>
<tr>
<td><%= sale.getGoods_code() %></td>
<td><%= sale.getOrder_number() %></td>
<td><%= sale.getId()%></td>
<td><%= sale.getSale_code() %></td>
<td><%= sale.getThe_number() %></td>
<td><%= sale.getSubOrder_date() %></td>
</tr>
<%} %>
</table>
</section>
<jsp:include page="/main/footer.jsp"></jsp:include>
</body>
</html>