package basic.boot;

import basic.app2.Animal;
import basic.app2.Cow;
import basic.app2.Dog;

public class AnimalMain {

	public static void main(String[] args) {
		
		System.out.println("Calling AnimalMain");
		Animal animal=new Animal();
		animal.type="Tiger";
		System.out.println("Animal Name=" +animal.type);
		System.out.println("noOfChildrens:" +animal.noOfChildrens());
		System.out.println("\n");
		
		Dog dog=new Dog();
		Animal animal1=new Dog();
		System.out.println("Type of Dog:" +animal1.type);
		System.out.println("No Of Childrens:" +animal1.noOfChildrens());
		System.out.println("\n");
		
		Cow cow=new Cow();
		Animal animal2=new Cow();
		System.out.println("Type of Cow:" +animal2.type);
		System.out.println("No of Childrens: " +animal2.noOfChildrens());
	}
}
