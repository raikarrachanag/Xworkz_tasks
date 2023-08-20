package Method.boot;

import Method.app.Kalla;

public class KallaRunner {

	public static void main(String[] args) {
		
		Kalla kalla=new Kalla("Ram", 24, 10, true, "Mumbai",5000);
		System.out.println(kalla);
		
		Kalla kalla1=new Kalla("Ram", 24, 8, true, "Delhi", 10000);
		System.out.println(kalla1);
		System.out.println("**********************************************************");
		
		boolean same=kalla.equals(kalla1);
		System.out.println("The Properties are same:"+same);
		
	}
}
