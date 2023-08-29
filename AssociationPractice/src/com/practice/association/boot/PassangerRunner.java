package com.practice.association.boot;

import com.practice.association.app.Bus;
import com.practice.association.app.Passanger;

public class PassangerRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in PassengerRunner");
		int age = 25;
		Bus bus = new Bus();
		Passanger pass = new Passanger(age);
		pass.setPassenger(bus);
		pass.travelling();
	}
}
