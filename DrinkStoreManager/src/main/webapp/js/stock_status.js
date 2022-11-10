/**
 * 
 */
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
                    let table = $("#stock_tbl");
                    for(let i=0; i<goodsList.length; i++){
                        console.log(i);
                        console.log(goodsList[i].kind);
                        table.append(
						`<tr> 
                            <td> ${i+1} </td>
                            <td> ${goodsList[i].kind}</td> 
                            <td> ${goodsList[i].goods_code} </td>
                            <td> ${goodsList[i].goods_name} </td>
                            <td> ${goodsList[i].goods_stock} </td>
                        </tr>`);
                    }
                },
                error:function(data, textStatus){
				alert("오류 발생");
                },
                complete:function(data, textStatus){
                    //alert("done"); 
                }
            }
        );
    }

    $(document).ready(goods());