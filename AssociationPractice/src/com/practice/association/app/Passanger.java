package com.practice.association.app;

public class Passanger {
	private int age;
	private Bus bus;

	public Passanger(int age) {
		this.age = age;
	}

	public void setPassenger(Bus bus) {
		this.bus = bus;
	}

	public void travelling() {
		System.out.println("invoking travelling() in passenger");
		this.bus.stop();

	}
}
