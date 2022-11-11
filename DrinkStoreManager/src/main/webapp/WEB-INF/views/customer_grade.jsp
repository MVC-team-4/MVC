<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="customerPage.model.CustomerGrade"%>
<%@page import="customerPage.model.CustomerGradeDao"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객 등급관리</title>
<%  
	String path = request.getContextPath();
%>
<link href="<%=path %>/css/section.css" rel= "stylesheet" type="text/css">
<link href="<%=path %>/css/customergrade.css" rel= "stylesheet" type="text/css">
</head>
<%
	CustomerGrade grade =(CustomerGrade)request.getAttribute("grade");
%>

<body>
<jsp:include page="/main/header.jsp"></jsp:include>
<jsp:include page="/main/nav.jsp"></jsp:include>

<section>
	<form action="CustomerGrade" method="post">
        <div class="wrap">
            <h3> 고객 등급 관리 </h3>
            <div class="table">
                <!--thead-->
                <div class="thead">
                    <!--tr-->
                    <div class="tr">
                        <div class="gradeName">등급명</div>
                        <div class="gradeCondition">등급조건</div>
                        <div class="gradeBenefits">등급별 혜택</div>
                    </div>
                </div>

                <!--tbody-->
                <div class="tbody">
                    <!-- tr-->
                    <div class="tr">
                        <div class="gradename">VVIP</div>
                        <div class="gradecondition">
                            구매금액
                            <input type="text" class="text" name="vvip" value=<%= grade.getVvip() %>>이상
                        </div>
                        <div class="gradebenefits"> 10% 적립</div>
                    </div>

                    <div class="tr">
                        <div class="gradename">VIP</div>
                        <div class="gradecondition">
                            구매금액
                            <input type="text" class="text" name="vip" value=<%= grade.getVip() %>>이상
                        </div>
                        <div class="gradebenefits"> 5% 적립</div>
                    </div>

                    <div class="tr">
                        <div class="gradename">GOLD</div>
                        <div class="gradecondition">
                            구매금액
                            <input type="text" class="text" name="gold" value=<%= grade.getGold() %>>이상
                        </div>
                        <div class="gradebenefits"> 3% 적립</div>
                    </div>

                    <div class="tr">
                        <div class="gradename">SILVER</div>
                        <div class="gradecondition">-
                        </div>
                        <div class="gradebenefits"> 1% 적립</div>
                    </div>
                </div>
               
            </div>
					 <button>저장</button>
        </div>
        
        <% 	
	        CustomerGradeDao service = new CustomerGradeDao();
	        service.updateGrade(grade); 
	    %>
        
    </form>
    
    
</section>

<jsp:include page="/main/footer.jsp"></jsp:include>
</body>
</html>