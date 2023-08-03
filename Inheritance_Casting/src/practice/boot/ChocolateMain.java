package practice.boot;

import practice.app3.CaramelChocolate;
import practice.app3.Chocolate;
import practice.app3.DarkChocolate;
import practice.util.ChocolateUtil;

public class ChocolateMain {
	public static void main(String[] args) {
		System.out.println("Running Main ...............");
		
		Chocolate chocolate=new Chocolate();
		
		DarkChocolate darkChocolate=new DarkChocolate();
		
		CaramelChocolate caramelChocolate=new CaramelChocolate();
		
		ChocolateUtil chocolateUtil=new ChocolateUtil();
		System.out.println("Calling run methos using chocolate ref");
		chocolateUtil.run(chocolate);	
		System.out.println("------------------------------------");
		
		ChocolateUtil chocolateUtil2=new ChocolateUtil();
		System.out.println("Calling run methos using DARK chocolate ref");
		chocolateUtil2.run(darkChocolate);	
		System.out.println("------------------------------------");
		
		ChocolateUtil chocolateUtil3=new ChocolateUtil();
		System.out.println("Calling run methos using CARAMEL chocolate ref");
		chocolateUtil3.run(caramelChocolate);	
		System.out.println("------------------------------------");
		
		
	}
}
