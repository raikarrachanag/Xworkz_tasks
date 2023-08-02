package basic.boot;

import basic.app.Computer;
import basic.app.Laptop;

public class ComputerMain {

	public static void main(String[] args) {
		System.out.println("Calling Main Class");
		Computer computer=new Computer();
		System.out.println("price of Computer:" +computer.price());
		System.out.println("\n");
		
		Laptop laptop=new Laptop();
		Computer computer1=new Laptop();
		System.out.println("Price of Computer:" +laptop.price());
		System.out.println("Brand Of Laptop:" +laptop.brand());
		
	}
}
