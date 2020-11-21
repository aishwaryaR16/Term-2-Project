package Controller;

import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.servlet.*;
import java.sql.*;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String loginId=request.getParameter("loginId");
		String password=request.getParameter("passwd");
		
		
		Model.User userObj=new Model.User();
		
		userObj.setLoginId(loginId);
		userObj.setPassword(password);
		
		
		try
		{
		dao.UserDAO userDAO=new dao.UserDAO();
		Model.User tempUser=userDAO.checkLogin(userObj);
		
		if(tempUser!=null)
		{
			request.setAttribute("loginId", loginId);
			request.setAttribute("userInfo", tempUser);
			
			
		RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
		}
		
		else
		{
			request.setAttribute("errorInfo","Invalid LoginId or Password");
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
		}
		}
		catch(Exception e)
		{
			request.setAttribute("errorInfo","Exception Occured" +e.getMessage());
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
		}
	}

}
