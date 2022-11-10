package mainPage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import goodsPage.model.dao.goodsDao;
import goodsPage.model.service.goodsService;

@WebServlet("/goodsJson")
public class goodsServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//메인페이지 상품 재고현황 데이터
		goodsService service = new goodsService(new goodsDao());
		String goodsData = service.getJson();
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(goodsData);
	}
}
