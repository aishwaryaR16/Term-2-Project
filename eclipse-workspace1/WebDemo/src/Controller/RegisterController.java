package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loginId=request.getParameter("loginId");
		String password=request.getParameter("passwd");
		String customerName=request.getParameter("customerName");
		String emailId=request.getParameter("emailId");
		String mobileNo=request.getParameter("mobileNo");
		String address=request.getParameter("address");
		String country=request.getParameter("country");
		
		
		Model.User userObj=new Model.User();
		
		userObj.setLoginId(loginId);
		userObj.setPassword(password);
		userObj.setCustomerName(customerName);
		userObj.setEmailId(emailId);
		userObj.setMobile(mobileNo);
		userObj.setAddress(address);
		userObj.setCountry(country);
		
		try
		{
			dao.UserDAO userDAO=new dao.UserDAO();
			
			if(userDAO.insertCustomer(userObj))
			{
				request.setAttribute("loginId", loginId);
				
				RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
				dispatcher.forward(request, response);
			}
			else
			{
				request.setAttribute("errorInfo","Problem Occured");
				
				RequestDispatcher dispatcher=request.getRequestDispatcher("Register.jsp");
				dispatcher.forward(request, response);
			}
		}
			catch(Exception e)
			{
				request.setAttribute("errorInfo","Exception Occured"+e.getMessage());
				
				RequestDispatcher dispatcher=request.getRequestDispatcher("error.jsp");
				dispatcher.forward(request, response);
			}
		
		}
		
	}


