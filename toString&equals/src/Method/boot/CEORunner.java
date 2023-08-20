package Method.boot;

import Method.app.CEO;

public class CEORunner {
 
	public static void main(String[] args) {
		System.out.println("Invoking main in CEORunner");
		
		CEO ceo=new CEO("Devayani","Google", 21, 1, "Female", "Software Engineer" );
		System.out.println(ceo);
		
		CEO ceo1=new CEO("Devayani", "Microsoft", 21, 4, "Female", "Software Developer");
		System.out.println(ceo1);
		System.out.println("******************************************************************");
		
		boolean same=ceo.equals(ceo1);
		System.out.println("Properties are same:" +same);
		
		
	}
}
