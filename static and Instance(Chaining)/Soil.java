class Soil{
	
 static String color;
 static float price;
 int quantity;
 String texture;
 
 Soil()
 { 
  super();
  System.out.println("Invoking const of Soil");
 }
 
 Soil(String color, float price)
 {
  System.out.println("Invoking const of Soil");
  this.color=color;
  this.price=price;
 }
 
 Soil(String color, float price, int quantity, String texture)
 {
  System.out.println("Invoking const of Soil");
  this.color=color;
  this.price=price;
  this.quantity=quantity;
  this.texture=texture;
  }
  
 static void printstatic()
 {
  System.out.println("Invoking main in Soil");
  System.out.println(color);
  System.out.println(price);
 }
 
 void printInstance()
 {
  System.out.println("Invoking main in Soil");
  System.out.println(quantity);
  System.out.println(texture);
 }
}