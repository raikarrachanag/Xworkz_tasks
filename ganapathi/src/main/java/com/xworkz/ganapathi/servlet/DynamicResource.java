package com.xworkz.ganapathi.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns="/owl", loadOnStartup =1)
	public class DynamicResource extends HttpServlet {
		public DynamicResource() {
			System.out.println("Creating DynamicResource......");
		}

	}

