package goodsPage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import goodsPage.model.GoodsDao;
import goodsPage.model.GoodsService;

@WebServlet("/goodsOrderByPriceJson.do")
public class GoodsListOrderByPriceServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//상품 리스트 코드순배열
		GoodsService service = new GoodsService(new GoodsDao());
		String goodsData = service.getOrderByPriceJson();
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(goodsData);
	}
}
