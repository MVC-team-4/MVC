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
import customerPage.model.CustomerService;

@WebServlet("/Customerlist")
public class CustomerListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		CustomerDao dao = new CustomerDao();
		CustomerService service = new CustomerService(dao);
		
		ArrayList<Customer> list = service.selectGradeAll();
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("WEB-INF/views/customer_list.jsp").forward(request, response);
	}
	
}
