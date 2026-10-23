package ch02.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/FormInputServlet")
public class FormInputServlet extends HttpServlet{
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
		String id = req.getParameter("user_id");
		String pw = req.getParameter("user_pw");
		String email = req.getParameter("user_email");
		String data = "<html>";
		data+="<body>";
		data+="계정: ";
		data+=id;
		data+="<br>";
		data+="암호: ";
		data+=pw;
		data += "<br>";
		data += "메일: " + email;
		data+="</body>";
		data+="</html>";
		System.out.printf("계정: %s\n 암호: %s",id,pw);
		out.print(data);
	}
	@Override 
	public void destroy() {
		System.out.println("desteoy() 호출");
	}
}
