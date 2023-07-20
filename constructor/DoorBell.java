class DoorBell{

 int price;
 double netWeight;
 int frequency;
 int voltage;
 String electricPower;
 int wattage;
 String use;
 
 DoorBell()
 {
  System.out.println("Invoking const in DoorBell");
 }
 
 DoorBell(int price)
 {
 System.out.println("Invoking const in DoorBell");
 System.out.println("Price of DoorBell: " +price);
 this.price=price;
 }
 
 DoorBell(int price, double netWeight)
 {
 System.out.println("Invoking const in DoorBell");
 System.out.println("Price of DoorBell: " +price);
 System.out.println("netWeight of DoorBell: " +netWeight);
 this.price=price;
 this.netWeight=netWeight;
 }
 
  DoorBell(int price, double netWeight, int frequency)
 {
 System.out.println("Invoking const in DoorBell");
 System.out.println("Price of DoorBell: " +price);
 System.out.println("netWeight of DoorBell: " +netWeight);
 System.out.println("frequency of DoorBell: " +frequency);
 this.price=price;
 this.netWeight=netWeight;
 this.frequency=frequency;
 }
 
 DoorBell(int price, double netWeight, int frequency, int voltage)
 {
 System.out.println("Invoking const in DoorBell");
 System.out.println("Price of DoorBell: " +price);
 System.out.println("netWeight of DoorBell: " +netWeight);
 System.out.println("frequency of DoorBell: " +frequency);
 System.out.println("voltage of DoorBell: " +voltage);
 this.price=price;
 this.netWeight=netWeight;
 this.frequency=frequency;
 this.voltage=voltage;
 }
 
 DoorBell(int price, double netWeight, int frequency, int voltage, String electricPower)
 {
 System.out.println("Invoking const in DoorBell");
 System.out.println("Price of DoorBell: " +price);
 System.out.println("netWeight of DoorBell: " +netWeight);
 System.out.println("frequency of DoorBell: " +frequency);
 System.out.println("voltage of DoorBell: " +voltage);
 System.out.println("electricPower of DoorBell: " +electricPower);
 this.price=price;
 this.netWeight=netWeight;
 this.frequency=frequency;
 this.voltage=voltage;
 this.electricPower=electricPower;
 }
 
 DoorBell(int price, double netWeight, int frequency, int voltage, String electricPower, int wattage)
 {
 System.out.println("Invoking const in DoorBell");
 System.out.println("Price of DoorBell: " +price);
 System.out.println("netWeight of DoorBell: " +netWeight);
 System.out.println("frequency of DoorBell: " +frequency);
 System.out.println("voltage of DoorBell: " +voltage);
 System.out.println("electricPower of DoorBell: " +electricPower);
 System.out.println("wattage of DoorBell: " +wattage);
 this.price=price;
 this.netWeight=netWeight;
 this.frequency=frequency;
 this.voltage=voltage;
 this.electricPower=electricPower;
 this.wattage=wattage;
 }
 
 DoorBell(int price, double netWeight, int frequency, int voltage, String electricPower, int wattage, String use)
 {
 System.out.println("Invoking const in DoorBell");
 System.out.println("Price of DoorBell: " +price);
 System.out.println("netWeight of DoorBell: " +netWeight);
 System.out.println("frequency of DoorBell: " +frequency);
 System.out.println("voltage of DoorBell: " +voltage);
 System.out.println("electricPower of DoorBell: " +electricPower);
 System.out.println("wattage of DoorBell: " +wattage);
 System.out.println("use of DoorBell: " +use);
 this.price=price;
 this.netWeight=netWeight;
 this.frequency=frequency;
 this.voltage=voltage;
 this.electricPower=electricPower;
 this.wattage=wattage;
 this.use=use;
 }
 
 }