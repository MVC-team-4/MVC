<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "customerPage.model.Customer" %>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%  String path = request.getContextPath();
%>
<link href="<%=path %>/css/customerlist.css" type="text/css" rel="stylesheet">
<link href="<%=path%>/css/header.jsp">
</head>
<body>

<%
ArrayList<Customer> list = (ArrayList<Customer>)request.getAttribute("list");
%>
	<form action="customer" method="post">
		<header>
	    	<div class="head">
	    	     <h2>Acorn Liquor</h2> 	
	    	</div>
	    </header>
	    
	    <div class="wrap">
	
	    	<h2> 고객 정보 조회 </h2>
	    	
	        <div class="table">
				<div class="tbhead">
				  <div class="tbrow">
				  	<div class="tbID">ID</div>
				    <div class="tbNAME">이름</div>
				    <div class="tbADDRESS">주소</div>
				    <div class="tbPHONENUM">전화번호</div>
				   </div>
				 </div>
			 
				 <%for (Customer customer: list){ %>
				 <div class="tbbody">
				   <div class="tbrow">
				    <div class="tbid"><%= customer.getId() %></div>
				    <div class="tbname"><%= customer.getName() %></div>
				    <div class="tbaddress"><%= customer.getAddress() %></div>
				    <div class="tbphonenum"><%= customer.getPhone_num() %></div>
				    <input type="button" class="btn" value="수정">
				   </div>
	        	</div>
	        	<%} %>
	    	</div>
	    
	    </div>
    
    </form>
</body>
</html>