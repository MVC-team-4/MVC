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
	let date = document.getElementById("date");
	window.location.href="datesale?date="+ date.value;
}
</script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<%
ArrayList<Sale> list = (ArrayList<Sale>)request.getAttribute("list");
%>

<section>
<table>

<caption>
<h3>��¥�� ��ȸ</h3>
��¥ : <input type="text" id="date">
<button onclick="find()">�˻�</button>
</caption>

<tr class="f">
<td>�ֹ���¥</td>
<td>�ֹ���ȣ</td>
<td>���̵�</td>
<td>�Ǹ��ڵ�</td>
<td>��ǰ�ڵ�</td>
<td>����</td>
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

</body>
</html>