package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loan")
public class LoanServlet extends HttpServlet{

	public LoanServlet()
	{
		System.out.println("Creating Loan Application....");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		System.out.println("GET in Loan Application");
		
		res.setContentType("text/html");
		PrintWriter writer=res.getWriter();
		
		writer.println("<html><head><title>Loan Application</title></head><body>");
		writer.println("<h1>Loan Application</h1>");
		
		writer.println("<p><a href=\"LoanApply.jsp\">Click here, to apply loan application</a></p>");
		writer.println("</body></html>");
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("POST in loan Application");
		
		String name=req.getParameter("name");
		String amount=req.getParameter("amount");
		String working=req.getParameter("working");
		String interest=req.getParameter("interest");
		String surety=req.getParameter("surety");
		String company=req.getParameter("company");
		String loanTenure=req.getParameter("loanTenure");
		String loanType=req.getParameter("loanType");
		
		System.out.println("Name:" +name);
		System.out.println("Amount:" +amount);
		System.out.println("Working:" +working);
		System.out.println("Interest:" +interest);
		System.out.println("Surety:" +surety);
		System.out.println("Company:" +company);
		System.out.println("Loan Tenure:" +loanTenure);
		System.out.println("Loan Type:" +loanType);
		
		req.setAttribute("name", name);
		req.setAttribute("amount", amount);
		req.setAttribute("working", working);
		req.setAttribute("interest", interest);
		req.setAttribute("surety", surety);
		req.setAttribute("company", company);
		req.setAttribute("loanTenure", loanTenure);
		req.setAttribute("loanType", loanType);
		
		req.getRequestDispatcher("LoanSuccess.jsp").forward(req, res);
		

	}
}
