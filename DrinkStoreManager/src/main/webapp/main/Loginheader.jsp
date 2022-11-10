<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
       h2 {
		  /* position: relative; */
		  padding: 0;
		  margin: 0;
		  font-family: "Raleway", sans-serif;
		  font-weight: 300;
		  font-size: 40px;
		  color: #080808;
		  -webkit-transition: all 0.4s ease 0s;
		  -o-transition: all 0.4s ease 0s;
		  transition: all 0.4s ease 0s;
		}
		.head a{
		text-decoration: none;
		}
 		.head h2 {
		  font-size:26px;
		  font-weight:700;
		  letter-spacing:1px;
		  text-transform:uppercase; width:160px;
		  text-align:center;
		  margin:auto;
		  white-space:nowrap;
		  padding-bottom:13px;
		}
		.head h2:before {
		    background-color: #c50000;
		    content: '';
		    display: block;
		    height: 3px;
		    width: 94px;
		    margin-bottom: 5px;
		}
		.head h2:after {
		    background-color: #c50000;
		    content: '';
		    display: block;
		    position:absolute;
            margin-left: 109px;
		    height: 3px;
		    width: 102px;
            margin-top: 5px;
		}
		.head,
		.head:before,
		.head:after {
		  -moz-box-sizing: border-box;
		  -webkit-box-sizing: border-box;
		  box-sizing: border-box;
		}
		.head {
		  position: relative;
		  background: #f8f8f8;
		  width: 90%;
		  max-width: 500px;
		  padding: 1em;
		  margin: 1em auto;
		  border: 3px solid rgba(0, 0, 0, 0.08);
		  background: #eee;
		}
		h1:before,
		h1:after {
		  background-color: #c50000;
		}
			.log_info{
		float: right;
		margin-top: -100px;
	    margin-right: 15px;
	    text-align: right;
	}
</style>
</head>
<body>
    <header>
    	<div class="head">
    	     <a href="staffLogin.jsp"> <h2>Acorn Liquor</h2> </a>	
    	</div>

    </header>
</body>
</html>