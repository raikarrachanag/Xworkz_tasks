package poc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Success")
public class AdressServlet extends HttpServlet{

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
			
			req.getRequestDispatcher("lastPage.jsp").forward(req, res);

		}
	
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	System.out.println("POST in loan Application");
	
	String no = request.getParameter("no");
	String street = request.getParameter("street");
    String state = request.getParameter("state");
    String country = request.getParameter("country");
    String city = request.getParameter("city");
    
    request.setAttribute("no", no);
    request.setAttribute("street", street);
    request.setAttribute("state", state);
    request.setAttribute("country", country);
    request.setAttribute("city", city);
    
    request.getRequestDispatcher("lastPage.jsp").forward(request, response);
}
}
