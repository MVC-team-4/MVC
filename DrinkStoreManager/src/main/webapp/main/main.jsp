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
            <ul><p>신규 주문 (11월 10일)</p>
                <li>1. 조니워커 4병</li>
                <li>2. 돔페리뇽 2병</li>
                <li>3. 발렌타인 30년 1병</li>
            </ul>
        </div>
        <div class="sales-wrap">
            <table id="sales-table">
                <tr>
                <p class="sales-title">매출 통계</p>
                    <th>날짜</th>
                    <th>11.03</th>
                    <th>11.04</th>
                    <th>11.05</th>
                    <th>11.06</th>
                </tr>
                <tr>
                    <td>매출 금액</td>
                    <td>\1,545,000</td>
                    <td>\1,359,000</td>
                    <td>\4,830,000</td>
                    <td>\1,685,000</td>
                </tr>
                <tr >
                    <td>매출 건수</td>
                    <td>2 건</td>
                    <td>3 건</td>
                    <td>9 건</td>
                    <td>3 건</td>
                </tr>
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