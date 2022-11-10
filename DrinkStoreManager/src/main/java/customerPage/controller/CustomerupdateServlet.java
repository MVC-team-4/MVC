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
import customerPage.model.CustomerService;

@WebServlet("/Customerupdate")
public class CustomerupdateServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//고객 등급관리 화면으로 이동
		request.getRequestDispatcher("WEB-INF/views/customer_update.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//form 데이터 받아오기
		request.setCharacterEncoding("UTF-8");
		String vvip = request.getParameter("vvip");
		String vip = request.getParameter("vip");
		String gold = request.getParameter("gold");
		CustomerGrade grade = new CustomerGrade(vvip, vip, gold);
		System.out.println(grade);
		
		//수정 서비스
		CustomerService service = new CustomerService(new CustomerDao());
		service.updateGrade(grade);
		
		//조회 서블릿으로
		response.sendRedirect("/DrinkStoreManager/Customerlist");
	}
}
