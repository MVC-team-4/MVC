package goodsPage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/goods-list.do")
public class GoodsListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("조회");
		//상품 조회 화면으로 이동
		request.getRequestDispatcher("WEB-INF/views/goods_list.jsp").forward(request, response);
	}
}
