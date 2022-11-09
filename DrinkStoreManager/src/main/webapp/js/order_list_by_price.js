 function goods(){
        alert("load 완료");
        $('#goods_tbody tr').remove();	
        $.ajax(
            {
                type:"post",
                dataType:"json",
                url:"/DrinkStoreManager/goodsOrderByCodeJson.do",
                success:function(data, textStatus){

                    let goodsList = data.goodsData;
                    let table = $("#goods_tbl");
                                      
                    for(let i=0; i<goodsList.length; i++){
                        table.append(
						`<tr> 
                            <td> ${goodsList[i].goods_code}</td>
                            <td> ${goodsList[i].goods_name}</td> 
                            <td> ${goodsList[i].kind} </td>
                            <td> ${goodsList[i].goods_price} </td>
                            <td> ${goodsList[i].goods_stock} </td>
                 			<td>
					  			<a href="goods-update.do?update_code=${goodsList[i].goods_code}">수정</a> / 
					  			<a href="goods-delete.do?delete_code=${goodsList[i].goods_code}">삭제</a>
							</td>
                 		</tr>`
                 		);
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