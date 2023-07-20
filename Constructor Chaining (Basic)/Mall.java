class Mall{

 String name;
 String location;
 int noOfShops;
 String famousShop;
 int discount;
 double minPriceOfShirt;
 int noOfFloors;
 
 Mall()
 {
  super();
  System.out.println("Invoking const in Mall");
 }
 Mall(String name)
 {
  this();
  System.out.println("Invoking args in Mall");
  this.name=name;
  }
 Mall(String name, String location)
 {
  this(name);
  System.out.println("Invoking args in Mall");
  this.location=location;
 }
 Mall(String name, String location, int noOfShops)
 {
 this(name, location);
 System.out.println("Invoking args in mall");
 this.noOfShops=noOfShops;
 }
 Mall(String name, String location, int noOfShops, String famousShop)
 {
 this(name, location, noOfShops);
 System.out.println("Invoking args in mall");
 this.famousShop=famousShop;
 }
 Mall(String name, String location, int noOfShops, String famousShop, int discount)
 {
 this(name, location, noOfShops, famousShop);
 System.out.println("Invoking args in mall");
 this.discount=discount;
 }
 Mall(String name, String location, int noOfShops, String famousShop, int discount, double minPriceOfShirt)
 {
 this(name, location, noOfShops, famousShop, discount);
 System.out.println("Invoking args in mall");
 this.minPriceOfShirt=minPriceOfShirt;
 }
 Mall(String name, String location, int noOfShops, String famousShop, int discount, double minPriceOfShirt, int noOfFloors)
 {
 this(name, location, noOfShops, famousShop, discount, minPriceOfShirt);
 System.out.println("Invoking args in mall");
 this.noOfFloors=noOfFloors;
 }
 }