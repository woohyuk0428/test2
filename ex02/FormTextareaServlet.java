package ch02.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/FormTextareaServlet")
public class FormTextareaServlet extends HttpServlet{
	@Override
	public void init() throws ServletException{
		System.out.println("init() 호출");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("doGet() 호출");
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = res.getWriter();
		String textarea = req.getParameter("textarea");
		String data = "<html>";
		data+="<body>";
		data+="<div style=\"font-size:1.2em; font-weight:bold; margin-bottom:5px;\">기타 의견</div>";
		data+= textarea;
		data+="</body>";
		data+="</html>";
		System.out.printf("기타 의견 %s",textarea);
		out.print(data);
	}
	@Override 
	public void destroy() {
		System.out.println("desteoy() 호출");
	}
}
