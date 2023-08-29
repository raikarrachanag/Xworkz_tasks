package com.practice.association.boot;

import com.practice.association.app.Paper;
import com.practice.association.app.Wood;

public class WoodRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in WoodRunner");
		double price=5000;
		Paper paper=new Paper();
		Wood wood =new Wood(price);
		wood.setWood(paper);
		wood.polish();
	}
}
