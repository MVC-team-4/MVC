package goodsPage.controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import goodsPage.model.dao.GoodsDao;
import goodsPage.model.service.GoodsService;

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
		String[] goodsdata = new String[4];
		goodsdata[0] = request.getParameter("goods_code");
		goodsdata[1] = request.getParameter("goods_name");
		goodsdata[2] = request.getParameter("kind");
		goodsdata[3] = request.getParameter("goods_price");
		//테스트
		System.out.println(Arrays.toString(goodsdata));
		
		//등록 서비스
		GoodsService service = new GoodsService(new GoodsDao());
		service.regGoods(goodsdata);
		
		//조회 서블릿으로 요청
		response.sendRedirect("/DrinkStoreManager/goods-list.do");
	}
}
