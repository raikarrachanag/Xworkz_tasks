package com.practice.association.boot;

import com.practice.association.app.Laptop;
import com.practice.association.app.Trainer;

public class LaptopRunner {


		public static void main(String[] args) {
			System.out.println("invoking main in LaptopRunner");
			double salary = 10000;
			Laptop lap = new Laptop();
			Trainer trainer = new Trainer(salary);
			trainer.setLaptop(lap);
			trainer.teaching();

		}
}
