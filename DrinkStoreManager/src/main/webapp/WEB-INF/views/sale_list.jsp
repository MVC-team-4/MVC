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
<h3>�Ǹų�����ȸ</h3>
</caption>

<tr class="f">
<td>�ֹ���ȣ</td>
<td>���̵�</td>
<td>�Ǹ��ڵ�</td>
<td>��ǰ�ڵ�</td>
<td>����</td>
<td>�ֹ���¥</td>
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
<span>�� ����: \ <%= total_price%></span>
<%} %>

</section>

<jsp:include page="/main/footer.jsp"></jsp:include>
</body>
</html>