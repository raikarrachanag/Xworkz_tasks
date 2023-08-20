package Method.boot;

import Method.app.Mechanic;

public class MechanicRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in MechanicRunner");
		
		Mechanic mech=new Mechanic("Chethan", 34, "Electrical", 10, true, 100);
		System.out.println(mech);
		
		Mechanic mech1=new Mechanic("Chethan", 34, "Electrical", 10, true, 100);
		System.out.println(mech1);
		System.out.println("***********************************************************");
		
		boolean same=mech.equals(mech1);
		System.out.println("the Properties are Same: "+same);
	}
}
