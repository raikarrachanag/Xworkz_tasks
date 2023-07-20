class Wallet{

 String brand;
 String material;
 float price;
 
 Wallet()
 {
  System.out.println("Invoking constructor in Wallet");
  System.out.println("Inside the Constructor: " +this.brand);
  System.out.println("Inside the Constructor: " +this.material);
  System.out.println("Inside the Constructor: " +this.price);
  
  this.brand="Louis Phillippi";
  this.material="leather";
  this.price=4999.9f;
  
  }
  Wallet(String brand, String material, float price)
  {
  System.out.println("Invoking constructor arguments in Wallet");
  this.brand=brand;
  this.material=material;
  this.price=price;
  }
 }