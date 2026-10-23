package ch02.ex02;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getLogin
 */
@WebServlet("/getLogin")
public class getLogin extends HttpServlet {
	
	public void init() throws ServletException {
		System.out.println("init() 호출");
	}
	public void destroy() {
		System.out.println("destroy() 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		System.out.println("게정: "+id); // name속성 id의 value값 출력 
		System.out.println("암호: "+pw); // name속성 pw의 value값 출력 
	}

	

}
