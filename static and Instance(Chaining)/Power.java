class Power{

 static boolean powerIsRelation;
 static boolean powerIsbilateral;
 int voltage;
 int wattage;
 
 Power()
 { 
  super();
  System.out.println("Invoking const of Power");
 }
 
 Power(boolean powerIsRelation, boolean powerIsbilateral)
 { 
  System.out.println("Invoking const of Power");
  this.powerIsRelation=powerIsRelation;
  this.powerIsbilateral=powerIsbilateral;
 }
 
 Power(boolean powerIsRelation, boolean powerIsbilateral, int voltage, int wattage)
 { 
  System.out.println("Invoking const of Power");
  this.powerIsRelation=powerIsRelation;
  this.powerIsbilateral=powerIsbilateral;
  this.voltage=voltage;
  this.wattage=wattage;
 }
 static void printstatic()
 { 
  System.out.println("Invoking main of Power");
  System.out.println(powerIsRelation);
  System.out.println(powerIsbilateral);
  }
  
  void printInstance()
 { 
  System.out.println("Invoking main of Power");
  System.out.println(voltage);
  System.out.println(wattage);
 }
}
 