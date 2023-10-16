package com.xworkz;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet(urlPatterns = { "/PoliceStation", "/PoliceStationServlet" }, loadOnStartup = 1)
public class PoliceStationServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Replace these placeholders with your actual station name, location, and station size.
        String stationName = "Channagiri Police Station";
        String location = "Nrupathunga Road, Channagiri";
        int numberOfCells = 10; // Replace with the actual number of cells.
        boolean isPainted = true; // Replace with the actual condition for painted or not.

        int casesPending = 150; // Replace with the actual number of pending cases.

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Police Station Home</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + stationName + "</h1>");
        out.println("<p>Location: " + location + "</p>");
        out.println("<h2>Police Station Home</h2>");
        out.println("<ul>");
        out.println("<li><a href='Police.html'>File a Police Report</a></li>");
        // Add more links or content for the home page as needed.
        out.println("</ul>");

        // Display a message based on the number of pending cases.
        if (casesPending > 100) {

            System.out.println("Too many cases pending");
        } else {
       
            System.out.println("Less cases pending");
        }

        // Display a message based on whether the station is painted or dirty.
        if (isPainted) {
            
            System.out.println("The station is clean");
        } else {
            
            System.out.println("The station is dirty");
        }

        // Display a message based on the station size.
        if (numberOfCells > 5) {
           
            System.out.println("Big station");
        } else {
         
            System.out.println("Small station");
        }

        
    }
}
