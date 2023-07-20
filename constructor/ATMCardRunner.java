class ATMCardRunner{

 public static void main(String[] args)
 {
  ATMCard atmcard = new ATMCard();
  System.out.println("Invoking bankName in ATMCardRunner: " +atmcard.bankName);
  System.out.println("Invoking balance in ATMCardRunner: " +atmcard.balance);
  System.out.println("Invoking costOfATMCard in ATMCardRunner: " +atmcard.costOfATMCard);
  
  System.out.println("==============================================================================");
  
  ATMCard atmcard1 = new ATMCard("ICICI", 200000, 250);
  System.out.println("Invoking bankName in ATMCardRunner: " +atmcard1.bankName);
  System.out.println("Invoking balance in ATMCardRunner: " +atmcard1.balance);
  System.out.println("Invoking costOfATMCard in ATMCardRunner: " +atmcard1.costOfATMCard);
  
  }}