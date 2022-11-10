<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "customerPage.model.Customer" %>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객 조회</title>

<%  String path = request.getContextPath();
%>
<link href="<%=path %>/css/customerlist.css" type="text/css" rel="stylesheet">
<link href="<%=path %>/css/section.css" rel= "stylesheet" type="text/css">
</head>
<body>
<jsp:include page="/main/header.jsp"></jsp:include>
<jsp:include page="/main/nav.jsp"></jsp:include>
<%
ArrayList<Customer> list = (ArrayList<Customer>)request.getAttribute("list");
%>
<section>
	<form action="customer" method="post">
			    
			<caption>
	    		<h3> 고객 정보 조회 </h3>
	    	</caption>
			    
	    <div class="wrap">
			
			
	    	
	    	<!--table-->
		    <div class="table">
		        <!--thead-->
		        <div class="thead">
		            <!-- tr-->
		            <div class="tr">
		                <div class="tbID">ID</div>
		                <div class="tbNAME">이름</div>
		                <div class="tbADDRESS">주소</div>
		                <div class="tbPHONENUM">전화번호</div>
		                <div class="tbGRADE">고객등급</div>
		            </div>
		        </div>        
		        <!--tbody-->
		        <% for (Customer customer: list){ %>
		        <div class="tbody">
		            <!-- tr-->
		            <div class="tr_body">
		                <div class="tbid"><%= customer.getId() %></div>
		                <div class="tbname"><%= customer.getName() %></div>
		                <div class="tbaddress"><%= customer.getAddress() %></div>
		                <div class="tbphonenum"><%= customer.getPhone_num() %></div>
		           		<div class="tbgrade"><%= customer.getGrade() %></div>
		            </div>
		        </div>
		        <%} %>
		    </div>
	    
	    </div>
    
    </form>
    </section>
    
    <jsp:include page="/main/footer.jsp"></jsp:include>
</body>
</html>