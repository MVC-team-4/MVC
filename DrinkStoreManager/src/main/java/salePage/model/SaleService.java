package salePage.model;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SaleService {

	//데이터 가져오기
	SaleDao saledao;
	
	//세터를 통해서 dao 주입
	public void setSaleDao(SaleDao saledao) {
		this.saledao = saledao;
	}
	
	public String getDao() {
		ArrayList<Sale> list = saledao.selectSales();
		
		JSONArray jArray = new JSONArray();
		
		for(int i=0; i<list.size(); i++) 
		{
			JSONObject json = new JSONObject();
			json.put("order_number", list.get(i).getOrder_number());
			json.put("id", list.get(i).getId());
			json.put("sale_code", list.get(i).getSale_code());
			json.put("goods_code", list.get(i).getGoods_code());
			json.put("tne_number", list.get(i).getThe_number());
			json.put("order_date", list.get(i).getSubOrder_date());
			
			jArray.add(json);
		}
		
		JSONObject obj = new JSONObject();
		obj.put("item", jArray);
		
		return obj.toString();
	}
}
