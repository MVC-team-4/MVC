package goodsPage.model.service;

import java.util.ArrayList;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import goodsPage.model.dao.goodsDao;
import goodsPage.model.dto.goods;

public class goodsService {
	
	goodsDao dao;

	public goodsService(goodsDao dao) {
		super();
		this.dao = dao;
	}
	
	//상품 등록 서비스
	public void regGoods(goods goods) {
		dao.insertGoods(goods);
	}
	
	//상품 전체 조회 서비스
	public ArrayList<goods> goodsSelectAll() {
		return dao.selectGoods();
	}
	
	//상품 전체 조회 JSON 데이터
	public String getJson() {
		ArrayList<goods> list = dao.selectGoods();
		
		JSONArray jArray = new JSONArray();
		for(goods goods : list) {
			JSONObject json = new JSONObject();
			json.put("kind", goods.getKind());
			json.put("goods_code", goods.getGoods_code());
			json.put("goods_name", goods.getGoods_name());
			json.put("goods_stock", goods.getGoods_stock());
			jArray.add(json);
		}
		JSONObject goodsData = new JSONObject();
		goodsData.put("goodsData", jArray);
		
		return goodsData.toString();
	}
	
	//상품 하나 조회 서비스
	public goods selectOneGoods (String update_code){
		return dao.selectOneGoods(update_code);
	}
	
	//상품 수정 서비스
	public void updateGoods (goods updateGoods){
		dao.updateGoods(updateGoods);
	}
	
	//상품 삭제 서비스
	public void deleteGoods(String delete_code) {
		dao.deleteGoods(delete_code);
	}
	
	//콘솔 테스트
	public static void main(String[] args) {
		goodsService service = new goodsService(new goodsDao());
		goods goodsdata = new goods("0001","블랑","맥주","3500","9999");
		service.regGoods(goodsdata);
	}

}
