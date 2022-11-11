<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*"%>  
   <%@ page import="java.util.ArrayList"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스마트스토어 : ACORN LIQUOR</title>
<% String path = request.getContextPath(); %>
<link href="<%=path %>/css/main.css" rel= "stylesheet" type="text/css">
<link href="<%=path %>/css/section.css" rel= "stylesheet" type="text/css">
</head>

<body>
<jsp:include page="/main/header.jsp"></jsp:include>
<jsp:include page="/main/nav.jsp"></jsp:include>

<section>
    <div class="section1">
        <div class="order-wrap">
            <h3>신규 주문 (11월 10일)</h3>
            <table class="new_order">
            	<thead>
            		<tr>
            			<th> No </th>
            			<th> 상품명 </th>
            			<th> 갯수 </th>
            		</tr>
            	</thead>
            		<tbody>
            			<tr>
            			<td>1</td>
            			<td>조니워커</td>
            			<td>4병</td>
            			</tr>
            			
            			<tr>
            			<td>2</td>
            			<td>돔페리뇽</td>
            			<td>2병</td>
            			</tr>
            			
            			<tr>
            			<td>3</td>
            			<td>발렌타인 30년</td>
            			<td>1병</td>
            			</tr>
            		</tbody>
            </table>
        </div>
        <div class="sales-wrap">
        	<h3>매출 통계</h3>
            <table id="sales-table">
            	<thead>
	            	<tr>
	            		<th>날짜</th>
	            		<th>매출 건수</th>
	            		<th>매출 금액</th>
	            	</tr>
            	</thead>
            	<tbody>
            		<tr>
            		<td>11월 03일</td>
            		<td>2건</td>
            		<td>\1,545,000</td>
            		</tr>
            		
            		<tr>
            		<td>11월 04일</td>
            		<td>3건</td>
            		<td>\1,359,000</td>
            		</tr>
            		
            		<tr>
            		<td>11월 05일</td>
            		<td>9건</td>
            		<td>\4,830,000</td>
            		</tr>
            		
            		<tr>
            		<td>11월 06일</td>
            		<td>3건</td>
            		<td>\1,685,000</td>
            		</tr>
            		
            		<tr>
            		<td>11월 07일</td>
            		<td>3건</td>
            		<td>\748,000</td>
            		</tr>
            	</tbody>
            </table>
        </div>
    </div>
    <div class="section2">
        <div class="stock-wrap">
            <jsp:include page="/main/stock_status.jsp"></jsp:include>
        </div>
    </div>
</section>

<jsp:include page="/main/footer.jsp"></jsp:include>
    	
</body>
</html>