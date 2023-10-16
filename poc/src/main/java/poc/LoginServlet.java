package poc;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");


        if (userId.equals("admin") && password.equals("secret")) {
            
            request.setAttribute("userId", userId);
            request.setAttribute("password", password);
            RequestDispatcher dispatcher=request.getRequestDispatcher("LoginSuccess.jsp");
            dispatcher.forward(request, response);
        } else {
          
            String errorMsg = "Credential Not Matching";
            request.setAttribute("errorMsg", errorMsg);
            RequestDispatcher dispatcher=request.getRequestDispatcher("Login.jsp");
            dispatcher.forward(request, response);      }
        
    }
 
}