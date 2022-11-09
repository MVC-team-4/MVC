<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 재고 현황</title>
<style>
    /*
    table{
    padding: 10px;
    margin: 10px auto;
    }
    table, tr, td{
        border: 1px solid black;
        border-collapse: collapse;
    }
    td{
        padding: 5px 10px;
    }
    */
</style>
<%
String path =  request.getContextPath();   
%>
<link href="<%=path%>/css/stock_status.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script>
    function goods(){
        alert("load 완료");
        
        $.ajax(
            {
                type:"post",
                dataType:"json",
                url:"/DrinkStoreManager/goodsJson",
                success:function(data, textStatus){
                    console.log(data);
                    let goodsList = data.goodsData;
                    alert(goodsList[0].goods_name);
                    alert(goodsList.length);
                    let table = $("#stock_tbody");
                    let apd = "</td> <td>";
                    for(let i=0; i<goodsList.length; i++){
                        console.log(i);
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
        /*
        let apd = "";
        let table = $("#stock_tbody");
        for(let i=0; i<15; i++){
            table.append("<tr> <td>"+ (i+1)+ "</td> <td> 2 </td> </tr>");
        }
        */
    }

    $(document).ready(goods());

    //goodsList[i].code
//goodsList[i].name
//goodsList[i].kind
//goodsList[i].price

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
    <button onclick="goods()">버튼</button>
</body>
</html>