package customerPage.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customerPage.model.Customer;
import customerPage.model.CustomerDao;
import customerPage.model.CustomerGrade;
import customerPage.model.CustomerGradeDao;
import customerPage.model.CustomerService;
import goodsPage.model.Goods;
import goodsPage.model.GoodsDao;
import goodsPage.model.GoodsService;

@WebServlet("/CustomerGrade")
public class CustomerGradeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//고객 등급관리 화면으로 이동
		CustomerGradeDao service = new CustomerGradeDao();
		CustomerGrade grade = service.selectGrade();
		request.setAttribute("grade", grade);
		////    
		
		
		request.getRequestDispatcher("WEB-INF/views/customer_grade.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//form 데이터 받아오기
		CustomerGradeDao service = new CustomerGradeDao();
		//수정 서비스
		request.setCharacterEncoding("UTF-8");
		String vvip = request.getParameter("vvip");
		String vip = request.getParameter("vip");
		String gold = request.getParameter("gold");
		CustomerGrade grade = new CustomerGrade(vvip, vip, gold);
		service.updateGrade(grade);
		System.out.println(grade);
		
		//상품 조회 화면으로 이동
		response.sendRedirect("/DrinkStoreManager/Customerlist");
	}
}
