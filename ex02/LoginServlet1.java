package ch02.ex02;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;

/**
 * Servlet implementation class LoginServlet1
 */

public class LoginServlet1 extends HttpServlet {
	public void init() throws ServletException{
		System.out.println("init()호출");
	}

	
	public void destroy() {
		System.out.println("destory() 호출");
	}
	

	
	

}
