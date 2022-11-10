<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객 등록</title>
<link rel="stylesheet" href="css/customer_reg.css">
<script>
function 
</script>
</head>
<body>

    <form action="customer2" method="post">
	    <header>
	    	<div class="head">
	    	     <h2>Acorn Liquor</h2> 	
	    	</div>
	    </header>
        <h3>고객 정보 등록</h3>
          <table>
            <tr>
              <td>
                ID
              </td>
              <td>
                <input type="text" name="customer_id">
              </td>
            </tr>
            <tr>
              <td>
                이름
              </td>
              <td>
                <input type="text" name="customer_name">
              </td>
            </tr>
            <tr>
              <td>
                주소
              </td>
              <td>
                <input type="text" name="address">
              </td>
            </tr>
            <tr>
              <td>
                핸드폰 번호
              </td>
              <td>
                <input type="text" name="phone_num">
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