package encapsulation.boot;

import encapsulation.app.Cred;

public class CredRunner {
	
	    public static void main(String[] args) {
	        
	        Cred cred = new Cred();
	       
			cred.setUserName("sanjana");
	        cred.setEmail("sanju@cred.com");
	        cred.setCardNumber("1234-5678-9012-3456");
	        cred.setExpiryDate("12/25");
	        cred.setCvv("123");
	        cred.setTotalCreditLimit(5000.0);
	        cred.setAvailableCredit(3000.0);
	        cred.setHasRewards(true);
	        cred.setIsInGoodStanding(true);
	        cred.setAge(30);
	        cred.setAddress("123 Main St, City");
	        cred.setPhoneNumber("9876565433");
	        cred.setAccountType("Silver");
	        cred.setActive(true);

	       
	        System.out.println("Username: " + cred.getUserName());
	        System.out.println("Email: " + cred.getEmail());
	        System.out.println("Card Number: " + cred.getCardNumber());
	        System.out.println("Expiry Date: " + cred.getExpiryDate());
	        System.out.println("CVV: " + cred.getCvv());
	        System.out.println("Total Credit Limit: " + cred.getTotalCreditLimit());
	        System.out.println("Available Credit: " + cred.getAvailableCredit());
	        System.out.println("Has Rewards: " + cred.hasRewards());
	        System.out.println("Is in Good Standing: " + cred.isInGoodStanding());
	        System.out.println("Age: " + cred.getAge());
	        System.out.println("Address: " + cred.getAddress());
	        System.out.println("Phone Number: " + cred.getPhoneNumber());
	        System.out.println("Account Type: " + cred.getAccountType());
	        System.out.println("Is Active: " + cred.isActive());
	    }
	}

	    

	   