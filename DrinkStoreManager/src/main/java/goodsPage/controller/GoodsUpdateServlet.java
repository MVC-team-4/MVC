package goodsPage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import goodsPage.model.Goods;
import goodsPage.model.GoodsDao;
import goodsPage.model.GoodsService;

@WebServlet("/goods-update.do")
public class GoodsUpdateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("수정");
		request.setCharacterEncoding("UTF-8");
		String update_code = request.getParameter("update_code");

		GoodsService service = new GoodsService(new GoodsDao());
		Goods goods = service.selectOneGoods(update_code);
		
		request.setAttribute("goods", goods);
		//상품 수정 화면으로 이동
		request.getRequestDispatcher("WEB-INF/views/goods_update.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//form 데이터
		request.setCharacterEncoding("UTF-8");
		Goods goods = new Goods();
		goods.setGoods_code(request.getParameter("goods_code"));
		goods.setGoods_name(request.getParameter("goods_name"));
		goods.setKind(request.getParameter("kind"));
		goods.setGoods_price(request.getParameter("goods_price"));
		goods.setGoods_stock(request.getParameter("goods_stock"));
		//테스트
		System.out.println(goods);

		//수정 서비스
		GoodsService service = new GoodsService(new GoodsDao());
		service.updateGoods(goods);

		//조회 서블릿으로 요청
		response.sendRedirect("/DrinkStoreManager/goods-list.do");
	}
	
}
