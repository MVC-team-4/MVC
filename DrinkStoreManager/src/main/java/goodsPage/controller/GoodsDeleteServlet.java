package goodsPage.controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import goodsPage.model.dao.GoodsDao;
import goodsPage.model.dto.Goods;
import goodsPage.model.service.GoodsService;

@WebServlet("/goods-delete.do")
public class GoodsDeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("삭제");
		request.setCharacterEncoding("UTF-8");
		String delete_code = request.getParameter("delete_code");
		System.out.println(delete_code);
		GoodsService service = new GoodsService(new GoodsDao());
		service.deleteGoods(delete_code);
		
		//상품 조회 화면으로 이동
		response.sendRedirect("/DrinkStoreManager/goods-list.do");
	}
	
}
