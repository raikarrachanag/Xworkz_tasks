package com.xworkz;

public class ExceptionHandling {
	
	public void Create() {
		System.out.println("Creating Create Method in ExceptionHandling....");
		try {   //it is the handler
			Check();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Exception Event is Handled");
		}
		System.out.println("After Handling");
		
	}
	
	public void Check() {
		System.out.println("Creating Check method in ExceptionHandling....");
		UnCheck();
	}
	
	public void UnCheck() {
		System.out.println("Creating Uncheck Method in ExceptionHandling....");
		Event();
		
	}
	
	public void Event() {
		System.out.println("Creating Event Method in ExceptionHandling....");
		EventHandling();
	}
	
	public void EventHandling() {
		System.out.println("Creating EventHandling Method in ExceptionHandling....");
		throw new ArrayStoreException("Creating ArrayStoreException....");
	}
	
	

}
