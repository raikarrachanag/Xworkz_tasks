package practiceAssociation.boot;

import practiceAssociation.app.PowerBank;

public class PowerBankRunner {

	public static void main(String[] args) {
		
		PowerBank powerbank = new PowerBank();
		powerbank.cable();
		powerbank.indicator();
	}
}
