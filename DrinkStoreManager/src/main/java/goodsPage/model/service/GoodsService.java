package goodsPage.model.service;

import java.util.ArrayList;

import goodsPage.model.dao.GoodsDao;
import goodsPage.model.dto.Goods;

public class GoodsService {
	
	GoodsDao dao;

	public GoodsService(GoodsDao dao) {
		super();
		this.dao = dao;
	}
	
	//상품 등록 서비스
	public void regGoods(String[] goodsdata) {
		dao.insertGoods(goodsdata);
	}
	
	//상품 전체 조회 서비스
	public ArrayList<Goods> goodsSelectAll() {
		return dao.selectGoods();
	}
	
	//상품 하나 조회 서비스
	public Goods goodsSelectOne (String update_code){
		return dao.selectOneGoods(update_code);
	}
	
	//상품 수정 서비스
	public void goodsUpdate (Goods updateGoods){
		dao.updateGoods(updateGoods);
	}
	
	//콘솔 테스트
	public static void main(String[] args) {
		GoodsService service = new GoodsService(new GoodsDao());
		String[] goodsdata = {"0001","블랑","맥주","3500"};
		service.regGoods(goodsdata);
	}

}
