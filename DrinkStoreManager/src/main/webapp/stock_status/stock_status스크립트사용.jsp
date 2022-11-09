<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 재고 현황</title>
<%
String path =  request.getContextPath();   
%>
<link href="<%=path%>/css/stock_status.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script>
    function goods(){
        //alert("load 완료");
        $.ajax(
            {
                type:"post",
                dataType:"json",
                url:"/DrinkStoreManager/goodsJson",
                success:function(data, textStatus){
                    console.log(data);
                    let goodsList = data.goodsData;
                    let table = $("#stock_tbody");
                    let apd = "</td> <td>";
                    for(let i=0; i<goodsList.length; i++){
                        console.log(goodsList[i].kind);
                        table.append("<tr> <td>"+ (i+1)+ apd + goodsList[i].kind+ apd + goodsList[i].goods_code + apd + goodsList[i].goods_name + apd + goodsList[i].goods_stock +"</td> </tr>");
                    }
                },
                error:function(data, textStatus){
				alert("오류 발생");
                },
                complete:function(data, textStatus){
                    alert("done"); 
                }
            }
        );
    }
    $(document).ready(goods());

</script>
</head>
<body>

    <table id="stock_tbl">
        <thead>
            <tr>
                <th>No</th>
                <th>종류</th>
                <th>상품코드</th>
                <th>상품명</th>
                <th>재고</th>
            </tr>
        </thead>
        <tbody id="stock_tbody">
            
        </tbody>
        
    </table>
</body>
</html>