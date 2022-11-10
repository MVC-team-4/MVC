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
<script>
function find(){
	let name = document.getElementById("name");
	window.location.href="namesale?name="+ name.value;
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
<h3>아이디별 조회</h3>
아이디 : <input type="text" id="name">
<button onclick="find()">검색</button>
</caption>

<tr class="f">
<td>아이디</td>
<td>주문번호</td>
<td>판매코드</td>
<td>상품코드</td>
<td>갯수</td>
<td>주문날짜</td>
</tr>

<%for (Sale sale: list)  {%>
<tr><td><%= sale.getId()%></td>
<td><%= sale.getOrder_number() %></td>
<td><%= sale.getSale_code() %></td>
<td><%= sale.getGoods_code() %></td>
<td><%= sale.getThe_number() %></td>
<td><%= sale.getSubOrder_date() %></td>
</tr>
<%} %>
</table>
</section>

<jsp:include page="/main/footer.jsp"></jsp:include>
</body>
</html>