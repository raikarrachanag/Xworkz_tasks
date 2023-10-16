// FarmerServlet.java
package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/save", "/run", "/wednesday" }, loadOnStartup = 1)
public class FarmerServlet extends HttpServlet {

    public FarmerServlet() {
        System.out.println("Created FarmerServlet....");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running service in FarmerServlet....");
        String uri = req.getRequestURI();
        String url = req.getRequestURL().toString();
        System.out.println("URI " + uri);
        System.out.println("URL " + url);

        String name = req.getParameter("farmerName");
        String soil = req.getParameter("soilType"); // Corrected parameter name
        String cropType = req.getParameter("cropType");
        String fertilizer = req.getParameter("fertilizers"); // Corrected parameter name
        String season = req.getParameter("Season"); // Corrected parameter name
        String investment = req.getParameter("investment");
        String profit = req.getParameter("profit");
        String recordNo = req.getParameter("recordNo");

        
        resp.setContentType("text/plain");
        PrintWriter writer = resp.getWriter();

        if (investment == null || profit == null) {
            
        } else {
            double convertedInvestment = Double.parseDouble(investment);
            double convertedProfit = Double.parseDouble(profit);

            System.out.println("farmer name is: " + name);
            System.out.println("Soil name is: " + soil);
            System.out.println("Crop Type is: " + cropType);
            System.out.println("Fertilizer name is: " + fertilizer);
            System.out.println("Season is: " + season);
            System.out.println("Investment is: " + investment);
            System.out.println("Profit is: " + profit);
            System.out.println("Record number is: " + recordNo);

            if (convertedProfit > convertedInvestment) {
                writer.print("This is good!!");
            } else {
                writer.print("This is not good!!");
            }
        }
    }
}
