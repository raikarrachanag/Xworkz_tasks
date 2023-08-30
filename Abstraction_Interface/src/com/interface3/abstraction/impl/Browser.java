package com.interface3.abstraction.impl;

import com.interface3.abstraction.app.Internet;

public class Browser {
	private Internet internet;

	public void connect() {
		System.out.println("Calling connect method from Browser Class...");
		this.internet.connect();
	}

	public void setInternet(Internet internet) {
		this.internet = internet;
	}
}

