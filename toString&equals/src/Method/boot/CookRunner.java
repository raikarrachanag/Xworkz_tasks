package Method.boot;

import Method.app.Cook;

public class CookRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in CookRunner");
		
		Cook cook=new Cook("Raman", 25, "Cooking", 4, true, false);
		System.out.println(cook);
		
		Cook cook1=new Cook("Raman", 25, "Cooking", 4, true, false);
		System.out.println(cook1);
		System.out.println("**********************************************************");
		
		boolean same=cook.equals(cook1);
		System.out.println("The properties are same: "+same);
	}
}
