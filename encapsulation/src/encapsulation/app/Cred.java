package encapsulation.app;

public class Cred {

	 
	    private String userName;
	    private String email;
	    private String cardNumber;
	    private String expiryDate;
	    private String cvv;
	    private double totalCreditLimit;
	    private double availableCredit;
	    private boolean hasRewards;
	    private boolean isInGoodStanding;
	    private int age;
	    private String address;
	    private String phoneNumber;
	    private String accountType;
	    private boolean isActive;

	   
	    public String getUserName() {
	        return userName;
	    }

	    public void setUserName(String userName) {
	        this.userName = userName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getCardNumber() {
	        return cardNumber;
	    }

	    public void setCardNumber(String cardNumber) {
	        this.cardNumber = cardNumber;
	    }

	    public String getExpiryDate() {
	        return expiryDate;
	    }

	    public void setExpiryDate(String expiryDate) {
	        this.expiryDate = expiryDate;
	    }

	    public String getCvv() {
	        return cvv;
	    }

	    public void setCvv(String cvv) {
	        this.cvv = cvv;
	    }

	    public double getTotalCreditLimit() {
	        return totalCreditLimit;
	    }

	    public void setTotalCreditLimit(double totalCreditLimit) {
	        this.totalCreditLimit = totalCreditLimit;
	    }

	    public double getAvailableCredit() {
	        return availableCredit;
	    }

	    public void setAvailableCredit(double availableCredit) {
	        this.availableCredit = availableCredit;
	    }

	    public boolean hasRewards() {
	        return hasRewards;
	    }

	    public void setHasRewards(boolean hasRewards) {
	        this.hasRewards = hasRewards;
	    }

	    public boolean isInGoodStanding() {
	        return isInGoodStanding;
	    }

	    public void setIsInGoodStanding(boolean isInGoodStanding) {
	        this.isInGoodStanding = isInGoodStanding;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    public String getAccountType() {
	        return accountType;
	    }

	    public void setAccountType(String accountType) {
	        this.accountType = accountType;
	    }

	    public boolean isActive() {
	        return isActive;
	    }

	    public void setActive(boolean isActive) {
	        this.isActive = isActive;
	    }

	    
	}


