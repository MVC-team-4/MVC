<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록</title>
<%
String path =  request.getContextPath();   
//현재 프로젝트의 이름 얻어옴 , 프로젝트1개 => 한 개의 웹사이트 
%>

<link href="<%=path%>/css/goods_reg.css" rel="stylesheet">
</head>
<body>
	<section>
    	<form action="goods-reg.do" method="post">
       	<h3>상품 등록</h3>
          <table>
            <tr>
              <td>
                상품코드
              </td>
              <td>
                <input type="text" name="goods_code">
              </td>
            </tr>
            <tr>
              <td>
                상품명
              </td>
              <td>
                <input type="text" name="goods_name">
              </td>
            </tr>
            <tr>
              <td>
                종류
              </td>
              <td>
                <input type="text" name="kind">
              </td>
            </tr>
            <tr>
              <td>
                상품금액
              </td>
              <td>
                <input type="text" name="goods_price">
              </td>
            </tr>
            <tr>
              <td colspan="2">
                <button>등록</button>
                <input type="reset" value="취소">
              </td>
            </tr>
          </table>
        </form>
	</section>
</body>
</html>