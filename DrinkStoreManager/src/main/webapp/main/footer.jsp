<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 html, body{
	    margin: 0;
	    padding: 0;
	    height: 100%;
	}
	footer{
		/* position: relative; */
	    bottom: 0;
	    left: 0;
	    width: 100%;
	    height:140px;
	    border-top: 1.5px solid #c50000;
	
	}
	footer div{
	    display: block;
	}
	footer .inner_footer{
	    padding: 15px 0 20px;
	    font-size: 13px;
	    overflow:auto;
	}
	footer .inner_footer .provision{
	    text-align: center;
	    overflow: hidden;
	    margin: 0 auto;
	    padding-top: 5px;
	}
	footer .inner_footer .provision .cus_center{
	    display: block;
	    margin: 8px 0 4px;
	}
	footer .inner_footer .provision .arr{
	    display: block;
	    margin-top: 15px;
	}
	footer .inner_footer .provision li{
	    display: inline;
	    position: relative;
	    padding: 0 7px 0 11px;
	    line-height: 14px;
	}
	footer .inner_footer .provision li::before{
	    position: absolute;
	    top: 50%;
	    left: 0;
	    width: 1px;
	    height: 11px;
	    margin-top: -5px;
	    background-color: #7d7f8162;
	    content: '';
	}
	footer ul, li{
	    list-style: none;
	}
</style>
</head>
<body>
     	<!--footer영역-->
        <div>
            <footer>
                <div class="inner_footer">
                    <ul class="provision">
                        <li>이용약관</li>
                        <li>전자금융거래 이용약관</li>
                        <li>개인정보 취급방침</li>
                        <li>법적고지</li>
                        <li>고객상담센터</li>
                    </ul>
                    <ul class="provision">
                        <li>사업자등록번호:101-86-89995</li>
                        <li>서울특별시 마포구 양화로 122 LAB7빌딩 3~4층</li>
                        <li>대표문의전화 02-2231-6412</li>
                        <li class="cus_center">고객상담센터 운영시간</li>
                        <li>평일 : AM 9:00 ~ PM 6:00</li>
                        <li>주말(토,일),공휴일 : AM 9:00~ PM 12:00</li>
                        <li class="arr">COPYRIGHT(C) HBILAB. ALL RIGHTS RESERVED.</li>
                    </ul>
                </div>
            </footer>
        </div>
</body>
</html>