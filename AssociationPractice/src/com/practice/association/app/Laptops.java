package com.practice.association.app;

public class Laptops {

	private String brand;
	private Processor processor;
	
	public Laptops(String brand)
	{
		this.brand=brand;
	}
	
	public void setLaptops(Processor processor)
	{
		this.processor=processor;
	}
	
	public void program()
	{
		System.out.println("Invoking program in Laptop");
	}
	public void movie()
	{
		System.out.println("Invoking movie in laptop");
	}
	public void game()
	{
		System.out.println("Invoking game in laptop");
	}
	public void chatting()
	{
		System.out.println("Invoking chatting in laptop");
		this.processor.memory();
		this.processor.ram();
		this.processor.size();
		this.processor.speed();
	}
}
