<%@page import="java.io.Console"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@ page import="java.sql.*"%>  
<%@ page import="java.util.ArrayList"%>
<%@ page import="goodsPage.model.dto.Goods"%>  
<!DOCTYPE html>
<html>
<head>
	<% String path = request.getContextPath(); %>
	<link href="<%=path %>/css/goods_list.css" rel= "stylesheet" type="text/css">
	<meta charset="UTF-8">
	<title>상품 조회</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="<%=path%>/js/order_list_by_price.js"></script>
</head>
<%
	ArrayList<Goods> list =(ArrayList<Goods>)request.getAttribute("list");
%>
<body>
	<section>
		<div id="title_wrap">
			<div id="title">목록(총 <span><%= list.size() %></span>개)</div>
			<div id="sort">
				<button onclick=goods()>상품코드순</button> 
			</div>
		</div>
		<div id="table_wrap">
			<table id="goods_tbl">
				<thead>
					<tr>
						<th>물품코드</th>
						<th>물품이름</th>
						<th>종류</th>
						<th>가격</th>
						<th>수량</th>
						<th>수정 / 삭제</th>
					</tr>
				</thead>
				<tbody id="goods_tbody">
					<% for( Goods goods : list){ %>
					<tr>
						<td><%= goods.getGoods_code() %></td>
						<td><%= goods.getGoods_name() %></td>
						<td><%= goods.getKind() %></td>
						<td><%= goods.getGoods_price() %></td>
						<td><%= goods.getGoods_stock() %></td>
						<td>
						  <a href="goods-update.do?update_code=<%= goods.getGoods_code() %>">수정</a> / 
						  <a href="goods-delete.do?delete_code=<%= goods.getGoods_code() %>">삭제</a>
						</td>
					</tr>
						<% } %>	
				</tbody>	
			</table>
		</div>
	</section>
</body>
</html>