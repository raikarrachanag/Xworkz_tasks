package practice.boot;

import practice.app.Bakery;
import practice.app.WorrierBakery;


public class BakeryMain {

		public static void main(String[] args) {
			System.out.println("Running Main...........");

			Bakery bakery = new Bakery();// printing overloading methods in parent class

			bakery.bake();
			bakery.bake(499.0);
			bakery.bake(10);
			bakery.bake("Sweet");
			bakery.bake("Cake", 49);
			bakery.bake("Juice", 10, 200);

			System.out.println("------------------------------");

			Bakery bakery2 = new WorrierBakery(); // Achive override through parent class ref

			bakery2.bake();
			bakery2.bake(699.0);
			bakery2.bake(9);
			bakery2.bake("Peda");
			bakery2.bake("Badam Sweet", 50);
			bakery2.bake("Juice", 20, 900);

			System.out.println("------------------------------");// Achive override through Child class ref

			WorrierBakery bakery3 = new WorrierBakery();

			bakery3.bake();
			bakery3.bake(899.0);
			bakery3.bake(5);
			bakery3.bake("Buiscuits");
			bakery3.bake("Cake", 49);
			bakery3.bake("Juice", 20, 700);

		}

	}


