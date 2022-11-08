package salePage.model;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SaleService {

	//데이터 가져오기
	SaleDao saleDao;
	
	//세터를 통해서 dao 주입
	public void setSaleDao(SaleDao saleDao) {
		this.saleDao = saleDao;
	}
	
}
