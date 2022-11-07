package goodsPage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/goods-update.do")
public class GoodsUpdateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("수정");
		//상품 수정 화면으로 이동
		request.getRequestDispatcher("WEB-INF/views/goods_update.jsp").forward(request, response);
	}
	
}
