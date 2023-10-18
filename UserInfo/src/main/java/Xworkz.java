import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/Attach",loadOnStartup=1)
public class Xworkz extends HttpServlet{
public Xworkz()
{
	System.out.println("Xworkz Object is Created");
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Name=req.getParameter("name");
		String Mobile=req.getParameter("mobile");
		String Email=req.getParameter("email");
		String Dob=req.getParameter("dob");
		String Location=req.getParameter("Location");
		String Password=req.getParameter("password");
		String ConfirmPassword=req.getParameter("confirmPassword");
		
		req.setAttribute("name", Name);
		req.setAttribute("mobile", Mobile);
		req.setAttribute("email", Email);
		req.setAttribute("dob", Dob);
		req.setAttribute("location", Location);
		req.setAttribute("password", Password);
		req.setAttribute("confirmpassword", ConfirmPassword);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("Information.jsp");
		dispatcher.forward(req, resp);
	}
}