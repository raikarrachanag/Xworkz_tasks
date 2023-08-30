package com.interface3.abstraction.impl;

import com.interface3.abstraction.app.PassportVerification;

public class Customer {
	private PassportVerification verification;

	public void verifyCitizen() {
		System.out.println("Verify Citizen method in Customer Class...");
		this.verification.verify();
	}

	public void setVerification(PassportVerification verification) {
		this.verification = verification;
	}
}


