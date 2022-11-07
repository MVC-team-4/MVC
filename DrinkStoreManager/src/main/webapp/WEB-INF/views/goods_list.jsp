<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>  
<%@ page import="java.sql.*"%>  
<%@ page import="java.util.ArrayList"%>
<%@ page import="goodsPage.model.dto.Goods"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<%
	ArrayList<Goods> list =(ArrayList<Goods>)request.getAttribute("list");
%>
<body>
		<table>
			<tr>
				<td>물품코드</td>
				<td>물품이름</td>
				<td>종류</td>
				<td>가격</td>
				<td>수량</td>
				<td>수정/삭제</td>
			</tr>
			<% for( Goods goods : list){ %>
			<tr>
				<td><%= goods.getGoods_code() %></td>
				<td><%= goods.getGoods_name() %></td>
				<td><%= goods.getKind() %></td>
				<td><%= goods.getGoods_price() %></td>
				<td><%= goods.getGoods_stock() %></td>
				
				<td><a href="goods-update.do?update_code=<%= goods.getGoods_code() %>">수정</a></td>
			</tr>
			<%	}%>	
		</table>
</body>
</html>