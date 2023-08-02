package basic.boot;

import basic.app3.Bird;
import basic.app3.Owl;
import basic.app3.Parrot;
import basic.app3.Peacock;

public class BirdMain {

	public static void main(String[] args) {
		
		System.out.println("Invoking main method");
		Bird bird=new Bird();
		System.out.println("The name of bird is "+bird.name);
		System.out.println("\n");
		
		Owl owl=new Owl();
		Bird bird1=new Owl();
		System.out.println("The color of owl: " +owl.color);
		System.out.println("The no Of Children:" +owl.noOfChildrens());
		System.out.println("\n");
		
		Parrot parrot = new Parrot();
		Bird bird2=new Parrot();
		System.out.println("The color of Parrot:" +parrot.color);
		System.out.println("The no of childrens: "+parrot.noOfChildrens());
		System.out.println("\n");
		
		Peacock peacock=new Peacock();
		Bird bird3=new Peacock();
		System.out.println("The Color of Peacock:" +peacock.color);
		System.out.println("The no of childrens: "+peacock.noOfChildrens());
		
		
	}
}
