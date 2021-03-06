package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
	{
		
		String productName=request.getParameter("productName");
		String price=request.getParameter("price");
		String desc=request.getParameter("desc");
		String stock=request.getParameter("stock");
		String category=request.getParameter("category");
		String supplier=request.getParameter("supplier");
	

		Model.Product productObj=new Model.Product();
		
		productObj.setProductName(productName);
		productObj.setPrice(Integer.parseInt(price));
		productObj.setDescription(desc);
		productObj.setStock(Integer.parseInt(stock));
		productObj.setCategory(category);
		productObj.setSupplier(supplier);
		
		try
		{
			dao.ProductDAO productDAO=new dao.ProductDAO();
			
			if(productDAO.insertProduct(productObj))
			{
				request.setAttribute("productlist", productDAO.getProductList());
				RequestDispatcher dispatcher=request.getRequestDispatcher("ProductDisplay.jsp");
				dispatcher.forward(request, response);
			}
			else
			{
				request.setAttribute("errorInfo","Problem Occured");
				
				RequestDispatcher dispatcher=request.getRequestDispatcher("error.jsp");
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
