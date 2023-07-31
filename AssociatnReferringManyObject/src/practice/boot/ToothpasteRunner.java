package practice.boot;

import practice.app.Company;
import practice.app.Toothpaste;

public class ToothpasteRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Toothpaste Runner");
		
		String name="Vedashakthi";
		String brand="Colgate";
		String company="Colgate-Palmolive Company";
		String[] ingredients= {"Salt", "Lavanga", "Pudina satva", "Garlic", "Karpura"};
		
		String cname="Colgate";
		String ceo="Noel R.wallac";
		String originCountry="United States";
		
		Toothpaste toothpaste=new Toothpaste(cname, brand, company, ingredients);
		toothpaste.printInfo();
		Company company1=new Company(name, ceo, originCountry);
		company1.printInfo();
		
				
 	}
}
