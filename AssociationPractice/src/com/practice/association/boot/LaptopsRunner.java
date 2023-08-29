package com.practice.association.boot;

import com.practice.association.app.Laptops;
import com.practice.association.app.Processor;

public class LaptopsRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in LaptopsRunner");
		String brand="DELL";
		Processor pro=new Processor();
		Laptops lap=new Laptops(brand);
		lap.setLaptops(pro);
		lap.game();
		lap.movie();
		lap.program();
		lap.chatting();

	}
}
