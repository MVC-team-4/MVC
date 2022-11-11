<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
section{
	width: 800px;
	margin: 0 auto;
}
main{
            display: block;
            justify-content: center;
            align-items: center;
            margin: 0 auto;
            width: 450px;
            height: 450px;
            border: 1px solid #13406f;
            margin-top: 100px;
            margin-bottom: 200px;
        }
        .log_title{
            text-align: center;
            font-size: 28px;
            padding-top: 30px;
            padding-bottom: 65px;
        }
         .log_title a{
        	color:#13406f;
        }
        .login_info{
            margin: 0 auto;
            width: 300px;
        }
         .login_info label{
        	color:#13406f;
        }
        .login_info input{
            width: 100%;
            margin-bottom: 30px;
            padding: 15px 10px 10px;
            background-color: transparent;
            border: none;
            border-bottom: 0.5px solid #00c73c;
            font-size: 17px;
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
            background-color:#00c73c;
            font-size: 25px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            color:white;
        }
        #footer{
        	margin: 0 auto;
        }
</style>
</head>
<body>
   
    <section>
		<main>
		       <div class="log_title">
		           <a>임직원 로그인</a>
		       </div>
		       <%
				String path =  request.getContextPath();   
				%>
		      <form action="<%=path %>/login.do"  method="post">
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
    </section>
	<footer id="footer">
	<jsp:include page="/main/login_footer.jsp"></jsp:include>
	</footer>
</body>
</html>