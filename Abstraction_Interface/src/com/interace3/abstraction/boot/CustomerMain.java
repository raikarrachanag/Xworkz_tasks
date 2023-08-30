package com.interace3.abstraction.boot;

import com.interface3.abstraction.app.PassportVerification;
import com.interface3.abstraction.impl.Customer;
import com.interface3.abstraction.impl.PassportVerificationImpl;

public class CustomerMain {

	public static void main(String[] args) {
		PassportVerification passportVerification = new PassportVerificationImpl();

		Customer customer = new Customer();
		customer.setVerification(passportVerification);
		customer.verifyCitizen();
	}

}
