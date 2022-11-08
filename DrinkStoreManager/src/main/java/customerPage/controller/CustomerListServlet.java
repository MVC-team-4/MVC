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

@WebServlet("/Customerlist")
public class CustomerListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		CustomerDao dao = new CustomerDao();
		
		ArrayList<Customer> list = dao.customers();
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("WEB-INF/view/customerlist.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getParameter("WEB-INF/view/customerlist.jsp");
	}
}
