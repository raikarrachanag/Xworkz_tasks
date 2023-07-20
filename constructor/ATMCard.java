class ATMCard{

 String bankName;
 double balance;
 int costOfATMCard;
 
 ATMCard()
 {
  System.out.println("Invoking constructor in ATMCard");
  System.out.println("Inside the constructor: " +this.bankName);
  System.out.println("Inside the constructor: " +this.balance);
  System.out.println("Inside the constructor: " +this.costOfATMCard);
  
  this.bankName="Karnataka Bank";
  this.balance=150000;
  this.costOfATMCard=200;
  
  }
  ATMCard(String bankName, double balance, int costOfATMCard)
  {
  System.out.println("Invoking constructor in ATMCard");
  this.bankName=bankName;
  this.balance=balance;
  this.costOfATMCard=costOfATMCard;
  }
 }