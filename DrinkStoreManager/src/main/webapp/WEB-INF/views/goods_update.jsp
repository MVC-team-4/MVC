<%@page import="goodsPage.model.dto.Goods"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 수정</title>
</head>
<body>
<%
	Goods goods =(Goods)request.getAttribute("goods");
%>
<body>
    <form action="goods-update.do" method ="post">
        <h3>상품 등록</h3>
          <table>
            <tr>
              <td>
                상품코드
              </td>
              <td>
                <input type="text" name="goods_code" value="<%= goods.getGoods_code() %>" readonly="readonly">
              </td>
            </tr>
            <tr>
              <td>
                상품명
              </td>
              <td>
                <input type="text" name="goods_name" value="<%= goods.getGoods_name() %>">
              </td>
            </tr>
            <tr>
              <td>
                종류
              </td>
              <td>
                <input type="text" name="kind" value="<%= goods.getKind() %>">
              </td>
            </tr>
            <tr>
              <td>
                상품금액
              </td>
              <td>
                <input type="text" name="goods_price" value="<%= goods.getGoods_price() %>">
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

</body>
</html>