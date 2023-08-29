package com.practice.association.boot;

import com.practice.association.app.Button;
import com.practice.association.app.Shirt;

public class ShirtRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in ShirtRunner");
		String colour="Blue";
		Button button=new Button();
		Shirt shirt=new Shirt(colour);
		shirt.setShirt(button);
		shirt.wearing();
	}

}
