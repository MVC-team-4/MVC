package salePage.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import salePage.model.Sale;
import salePage.model.SaleDao;

@WebServlet("/codesale")
public class CodeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain;charset=utf-8");
		
		
		String code =request.getParameter("code");
		System.out.print(code);
		
		
		SaleDao dao = new SaleDao();
		 ArrayList<Sale> list = dao.selectCodeSale(code);
		
		//데이터심기
		request.setAttribute("list", list);
		//view를 거쳐서 출력
		request.getRequestDispatcher("WEB-INF/views/codesale_list.jsp").forward(request, response);
	}
	
}
