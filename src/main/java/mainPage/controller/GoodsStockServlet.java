package mainPage.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import goodsPage.model.dao.GoodsDao;
import goodsPage.model.service.GoodsService;

@WebServlet("/goodsJson")
public class GoodsStockServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//메인페이지 상품 재고현황 데이터
		GoodsService service = new GoodsService(new GoodsDao());
		String goodsData = service.getJson();
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(goodsData);
	}
}
