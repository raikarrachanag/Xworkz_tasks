package com.xworkz.ganesha.servlets;

@webServlet(urlPatterns="/owl", loadOnStartup =1)
public class DynamicResource extends HttpServ {
	public DynamicResource() {
		System.out.println("Creating DynamicResource......");
	}

}
