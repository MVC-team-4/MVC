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
	public void regGoods(Goods goods) {
		dao.insertGoods(goods);
	}
	
	//상품 전체 조회 서비스
	public ArrayList<Goods> goodsSelectAll() {
		return dao.selectGoods();
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
