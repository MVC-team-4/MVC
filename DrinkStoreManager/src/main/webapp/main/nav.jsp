<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% String path = request.getContextPath(); %>
<link href="<%=path %>/css/navcss.css" rel= "stylesheet" type="text/css">
</head>
<body>
	<div id="body-wrapper">
		<div id="body-content">
			<div class="dropmenu">
			    <ul class="aa">
			        <li class="bb">
			
			            <div class="item">주류
			                <!--숨김메뉴-->
			                <div class="item_list">
			                    <div class="item_a">위스키
			                        <div class="drop">
			                            <p><a href="">발렌타인 30년</a></p>
			                            <p><a href="">글렌모렌지 시그넷</a></p>
			                            <p><a href="">아드벡</a></p>
			                            <p><a href="">조니워커</a></p>
			                        </div>
			                    </div>
			                    <div class="item_a">와인
			                        <div class="drop">
			                            <p><a href="">로얄 드마리아</a></p>
			                            <p><a href="">샤또 몽로즈 2015</a></p>
			                            <p><a href="">까시예로 델 디아블로</a></p>
			                        </div>
			                    </div>
			                    <div class="item_a">샴페인
			                        <div class="drop">
			                            <p><a href="">모엣 샹동</a></p>
			                            <p><a href="">돔페리뇽</a></p>
			                            <p><a href="">크루그</a></p>
			                            <p><a href="">뵈브클리코</a></p>
			                        </div>
			                    </div>
			                    <div class="item_a">맥주
			                        <div class="drop">
			                            <p><a href="">기네스</a></p>
			                            <p><a href="">버드 라이트</a></p>
			                            <p><a href="">하이네켄</a></p>
			                            <p><a href="">코로나</a></p>
			                        </div>
			                    </div>
			                </div>
			            </div>
			            
			        </li>
			        <li class="bb">
			            <div class="item"><a>상품 조회</a>
			            </div>
			        </li>
			    	<li class="bb">
			            <div class="item"><a href="/DrinkStoreManager/Customerlist">고객 조회</a>
			            </div>
			        </li>
			       	<li class="bb">
			            <div class="item"><a>판매 내역</a>
							<div class="item_sell">
			                    <div class="item_a">조회 방법
			                        <div class="drop">
			<p><a href="/DrinkStoreManager/sale">전체</a></p>
			                            <p><a href="/DrinkStoreManager/datesale">날짜</a></p>
			                            <p><a href="/DrinkStoreManager/codesale">상품코드</a></p>
			                            <p><a href="/DrinkStoreManager/namesale">ID</a></p>
			                             <p><a href="/DrinkStoreManager/pricesale">매출조회</a></p>
			                        </div>
			                    </div>
			            	</div>
			            </div>
			        </li>
			    </ul>
			</div>
		</div>
	</div>
</body>
</html>