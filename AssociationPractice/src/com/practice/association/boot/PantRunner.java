package com.practice.association.boot;

import com.practice.association.app.Pant;
import com.practice.association.app.Zip;

public class PantRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in PantRunner");
		int size=28;
		Zip zip=new Zip();
		Pant pan=new Pant(size);
		pan.setPant(zip);
		pan.washing();

	}
}
