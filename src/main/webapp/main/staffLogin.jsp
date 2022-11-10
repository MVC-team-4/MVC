<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
main{
            display: block;
            justify-content: center;
            align-items: center;
            margin: 0 auto;
            width: 450px;
            height: 450px;
            background-color: #eee;
            margin-top: 100px;
        }
        .log_title{
            text-align: center;
            font-size: 30px;
            padding-top: 30px;
            padding-bottom: 65px;
        }
        .login_info{
            margin: 0 auto;
            width: 300px;
        }
        .login_info input{
            width: 100%;
            margin-bottom: 30px;
            padding: 15px 10px 10px;
            background-color: transparent;
            border: none;
            border-bottom: 0.5px solid #c50000;
            font-size: 20px;
            outline: none;

        }
        .login_btn{
            text-align: center;
            margin-top: 25px;
        }
        .login_btn button{
            margin: 0 auto;
            width: 300px;
            height: 40px;
            background-color: #c50000;
            font-size: 25px;
            border: none;
            border-radius: 15px;
            cursor: pointer;
        }
</style>
</head>
<body>
    <header>
		<jsp:include page="/main/header.jsp"></jsp:include>
    </header>
	<main>
	       <div class="log_title">
	           <a>임직원 로그인</a>
	       </div>
	      <form  action="login.do"  method="post">
	      <div class="login_div">
	        <div class="login_info">
	            <label for="id">아이디</label>
	            <input type="text" name="id" id="id" placeholder="ID">
	        </div>
	        <div class="login_info">
	            <label for="pw">비밀번호</label>
	            <input type="password" name="pw" id="pw" placeholder="PASSWORD">
	        </div>
	        <div class="login_btn">
	            <button>로그인</button>
	        </div>
	      </div>
	     </form>
	 </main>
	<footer>
	<jsp:include page="/main/footer.jsp"></jsp:include>
	</footer>
</body>
</html>