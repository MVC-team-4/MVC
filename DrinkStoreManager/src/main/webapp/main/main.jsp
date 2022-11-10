<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*"%>  
   <%@ page import="java.util.ArrayList"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ACORN LIQUOR</title>
<style>
.main{
/* position:relative; */
width:100%;
height: 80%;
margin-top:30px;
}
.new_order{
margin-left:20%;
/* margin-top:-100px; */
background-color: green;
width:25%;
border: 1px solid rgb(237, 240, 245);
}
.new_order p{
margin-bottom:15px;
}
.new_order li{
padding-bottom:5px;
}
#table_wrap{
	width: 25%;
	margin-left:20%;
	border: 1px solid rgb(237, 240, 245);
	background-color: green;
}
.sell_title {
    margin-top: 15px;
    margin-bottom: 5px;
margin-left: 21%;
}
#table_wrap table, td, th{
	border: 1px solid rgb(237, 240, 245);
	border-collapse: collapse;
}
#table_wrap th{
	font-size: 15px;
	height: 30px;
	background-color: rgb(249, 249, 249);
}
#table_wrap tr{
	font-size: 15px;
}
#qtt_wrap{
	width: 25%;
	margin: -282px 57% 100px;
}
#qtt_wrap p{
margin-left: 25px;
}
#qtt_content{
width: 80%;
margin-left:10%;
margin-bottom:10px;
}
#qtt_wrap table, td, th{
	border: 1px solid rgb(237, 240, 245);
	border-collapse: collapse;
}
#qtt_wrap th{
	font-size: 15px;
	height: 30px;
	padding-right:15px;
	background-color: rgb(249, 249, 249);
}
#qtt_wrap tr{
	font-size: 15px;
}
</style>
</head>
<body>
<jsp:include page="/main/header.jsp"></jsp:include>
<jsp:include page="/main/nav.jsp"></jsp:include>
<section>

    <div class="main">
          <main>
              <div class="new_order">
                  <ul><p>신규 주문 (11월 9일)</p>
                      <li>1.</li>
                      <li>2.</li>
                      <li>3.</li>
                  </ul>
              </div>
              <div>
                  <table id="table_wrap">
                      <tr>
                      <p class="sell_title">매출 통계</p>
                          <th>날짜</th>
                          <th>11.03</th>
                          <th>11.04</th>
                          <th>11.05</th>
                          <th>11.06</th>
                      </tr>
                      <tr>
                          <td>매출금액</td>
                          <td>2</td>
                          <td>3</td>
                          <td>4</td>
                          <td>5</td>
                      </tr>
                      <tr >
                          <td>매출 건수</td>
                          <td>2</td>
                          <td>3</td>
                          <td>4</td>
                          <td>5</td>
                      </tr>
      
                  </table>
              </div>
              
              <div id="qtt_wrap">
              <jsp:include page="/main/stock_status.jsp"></jsp:include>
                  
              </div>
          </main>
      </div>
</section>
    	<jsp:include page="/main/footer.jsp"></jsp:include>
    	
</body>
</html>