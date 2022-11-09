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
	let name = document.getElementById("name");
	window.location.href="namesale?name="+ name.value;
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
<h3>���̵� ��ȸ</h3>
���̵� : <input type="text" id="name">
<button onclick="find()">�˻�</button>
</caption>

<tr class="f">
<td>���̵�</td>
<td>�ֹ���ȣ</td>
<td>�Ǹ��ڵ�</td>
<td>��ǰ�ڵ�</td>
<td>����</td>
<td>�ֹ���¥</td>
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

</body>
</html>