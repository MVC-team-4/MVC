/**
 * 
 */
 function sales(){
        //alert("load 완료");
        $.ajax(
            {
                type:"post",
                dataType:"json",
                url:"/DrinkStoreManager/newSale",
                success:function(data, textStatus){
                    console.log(data);
                    let newSales = data.newSales;
                    let table = $("#newsale_tbody");
                    for(let i=0; i<newSales.length; i++){
                        console.log(i);
                        table.append(
						`<tr> 
                            <td> ${newSales[i].sale_code} </td>
                            <td> ${newSales[i].kind}</td> 
                            <td> ${newSales[i].goods_name} </td>
                            <td> ${newSales[i].the_number} </td>
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

    $(document).ready(sales());