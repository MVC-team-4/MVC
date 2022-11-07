<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록</title>
<link rel="stylesheet" href="css/goods.css">
</head>
<body>

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

</body>
</html>