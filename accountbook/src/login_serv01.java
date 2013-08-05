import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

class login_serv01 extends HttpServlet{
  public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	//エンコード方式の指定
		response.setContentType("text/html; charset=Windows-31J");
	//パラメータのエンコード方式の指定
		request.setCharacterEncoding("Windows-31J");

		HttpSession session = request.getSession(true);

  //user_nameパラメータの取得
		String user_name = request.getParameter("user_name");
		String password = request.getParameter("password");


		boolean check = check(user_name, password);

			if(check){
			session.setAttribute("login", "OK");
			String target = (String)session.getAttribute("target");
			response.sendRedirect("/accout_book/top.html");
		}
		else {
			session.setAttribute("status", "Not Auth");
			response.sendRedirect("/accout_book/login.jsp");
		}
	}

	private boolean check(String user_name, String password){
		boolean check = true;
		if(password.length()>16) check = false;
		if(password.length()<8) check = false;
		if(user_name.length()>8) check = false;
		if(user_name.length()<0) check = false;
		return check;
	}
}
