<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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


	<form>
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
                            <input type="text" class="text">이상
                        </div>
                        <div class="gradebenefits"> 10% 적립</div>
                    </div>

                    <div class="tr">
                        <div class="gradename">VIP</div>
                        <div class="gradecondition">
                            구매금액
                            <input type="text" class="text">이상
                        </div>
                        <div class="gradebenefits"> 5% 적립</div>
                    </div>

                    <div class="tr">
                        <div class="gradename">GOLD</div>
                        <div class="gradecondition">
                            구매금액
                            <input type="text" class="text">이상
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

        </div>
    </form>
</body>
</html>