package goodsPage.model.service;

import goodsPage.model.dao.GoodsDao;

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
	
	//콘솔 테스트
	public static void main(String[] args) {
		GoodsService service = new GoodsService(new GoodsDao());
		String[] goodsdata = {"0001","블랑","맥주","3500"};
		service.regGoods(goodsdata);
	}

}
