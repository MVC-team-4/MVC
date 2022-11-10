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

@WebServlet("/goods-reg.do")
public class GoodsRegServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("등록");
		//상품 등록 화면으로 이동
		request.getRequestDispatcher("WEB-INF/views/goods_reg.jsp").forward(request, response);
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
		
		//테스트
		System.out.println(goods);
		
		//등록 서비스
		GoodsService service = new GoodsService(new GoodsDao());
		service.regGoods(goods);
		
		//조회 서블릿으로 요청
		response.sendRedirect("/DrinkStoreManager/goods-list.do");
	}
}
