package mvcLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login.do")
public class Login   extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		System.out.print("dfdfdfd");
		
		String  id  =request.getParameter("id");
		String  pw = request.getParameter("pw");		
		
		LoginDAO dao = new LoginDAO();
		int result  =dao.login(id, pw);
		
		//로그인

		if(result==1) {
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("location.href = '/view/main.jsp'"); // main 페이지로 사용자를 보냄 
			out.println("</script>");		  
		}else if(result==0) {
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('비밀번호가 일치하지 않습니다.')");	
			out.println("history.back()");	
			out.println("</script>");
		}else if (result == -1) {
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('존재하지 않는 아이디입니다.')");	
			out.println("history.back()");	
			out.println("</script>");
		}else {
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('데이터베이스에 오류가 발생했습니다.')");	
			out.println("history.back()");	
			out.println("</script>");
		}
		
		
		// 메인화면
		
				
		
	} 

}
