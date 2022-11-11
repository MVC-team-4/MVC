package mainPage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//세션 아이디 받아오기
		HttpSession session = request.getSession();
		//String id = (String) session.getAttribute("id");
		
		if(session.getAttribute("id") != null) {
			//메인화면으로
			request.getRequestDispatcher("main/main.jsp").forward(request, response);
		}else {
			//아이디 없으면 로그인 화면으로
			response.sendRedirect("/DrinkStoreManager/login.do");
		}
		
	}
}
