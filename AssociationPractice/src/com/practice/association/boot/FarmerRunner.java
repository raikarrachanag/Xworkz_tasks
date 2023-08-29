package com.practice.association.boot;

import com.practice.association.app.Farmer;
import com.practice.association.app.Land;

public class FarmerRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in FarmerRunner");
		String name="Rachana";
		Land land=new Land();
		Farmer farmer=new Farmer(name);
		farmer.setLand(land);
		farmer.farming();
		
	}
}