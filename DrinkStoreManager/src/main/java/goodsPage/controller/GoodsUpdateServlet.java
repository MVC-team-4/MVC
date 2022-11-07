package goodsPage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import goodsPage.model.dao.GoodsDao;
import goodsPage.model.dto.Goods;
import goodsPage.model.service.GoodsService;

@WebServlet("/goods-update.do")
public class GoodsUpdateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("수정");
		request.setCharacterEncoding("UTF-8");
		String update_code = request.getParameter("update_code");

		GoodsService service = new GoodsService(new GoodsDao());
		Goods goods = service.goodsSelectOne(update_code);
		
		request.setAttribute("goods", goods);
		//상품 수정 화면으로 이동
		request.getRequestDispatcher("WEB-INF/views/goods_update.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
}
