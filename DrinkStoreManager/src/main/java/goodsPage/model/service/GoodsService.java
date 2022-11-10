package goodsPage.model.service;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import goodsPage.model.dao.GoodsDao;
import goodsPage.model.dto.Goods;

public class GoodsService {
	
	GoodsDao dao;

	public GoodsService(GoodsDao dao) {
		super();
		this.dao = dao;
	}
	
	//상품 등록 서비스
	public void regGoods(Goods goods) {
		dao.insertGoods(goods);
	}
	
	//상품 전체 조회 서비스
	public ArrayList<Goods> goodsSelectAll() {
		return dao.selectGoods();
	}
	
	
	//상품 전체 조회: 가격 정렬
	public String getOrderByPriceJson() {
		ArrayList<Goods> list = dao.selectGoodsSortByPrice();
		
		JSONArray jArray = new JSONArray();
		for(Goods goods : list) {
			JSONObject json = new JSONObject();
			json.put("kind", goods.getKind());
			json.put("goods_code", goods.getGoods_code());
			json.put("goods_name", goods.getGoods_name());
			json.put("goods_price", goods.getGoods_price());
			json.put("goods_stock", goods.getGoods_stock());
			jArray.add(json);
		}
		JSONObject goodsData = new JSONObject();
		goodsData.put("goodsData", jArray);
		
		return goodsData.toString();
	}
	//상품 전체 조회: 코드 정렬
		public String getOrderByCodeJson() {
			ArrayList<Goods> list = dao.selectGoodsSortByCode();
			
			JSONArray jArray = new JSONArray();
			for(Goods goods : list) {
				JSONObject json = new JSONObject();
				json.put("kind", goods.getKind());
				json.put("goods_code", goods.getGoods_code());
				json.put("goods_name", goods.getGoods_name());
				json.put("goods_price", goods.getGoods_price());
				json.put("goods_stock", goods.getGoods_stock());
				jArray.add(json);
			}
			JSONObject goodsData = new JSONObject();
			goodsData.put("goodsData", jArray);
			
			return goodsData.toString();
		}
	
	//상품 전체 조회: 코드 정렬	
	public String getOrderByStockJson() {
		ArrayList<Goods> list = dao.selectGoodsSortByStock();
		
		JSONArray jArray = new JSONArray();
		for(Goods goods : list) {
			JSONObject json = new JSONObject();
			json.put("kind", goods.getKind());
			json.put("goods_code", goods.getGoods_code());
			json.put("goods_name", goods.getGoods_name());
			json.put("goods_price", goods.getGoods_price());
			json.put("goods_stock", goods.getGoods_stock());
			jArray.add(json);
		}
		JSONObject goodsData = new JSONObject();
		goodsData.put("goodsData", jArray);
		
		return goodsData.toString();
	}
	
	//상품 전체 조회 JSON 데이터
	public String getJson() {
		ArrayList<Goods> list = dao.selectGoods();
		
		JSONArray jArray = new JSONArray();
		for(Goods goods : list) {
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
	public Goods selectOneGoods (String update_code){
		return dao.selectOneGoods(update_code);
	}
	
	//상품 수정 서비스
	public void updateGoods (Goods updateGoods){
		dao.updateGoods(updateGoods);
	}
	
	//상품 삭제 서비스
	public void deleteGoods(String delete_code) {
		dao.deleteGoods(delete_code);
	}
	
	//콘솔 테스트
	public static void main(String[] args) {
		GoodsService service = new GoodsService(new GoodsDao());
		Goods goodsdata = new Goods("0001","블랑","맥주","3500","9999");
		service.regGoods(goodsdata);
	}

	

}
