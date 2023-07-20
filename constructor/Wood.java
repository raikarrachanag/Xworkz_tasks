class Wood{

 String type;
 float price;
 String color;
 String use;
 int length;
  
 Wood()
 {
  System.out.println("Invoking const in Wood");
 }
 
 Wood(String type)
 {
  System.out.println("Invoking String Const of Wood");
  this.type=type;
 }
 
 Wood(String type, float price)
 {
  System.out.println("Invoking String, float const of Wood");
  this.type=type;
  this.price=price;
 }
 
 Wood(String type, float price, String color)
 {
  System.out.println("Invoking String, float, String const of Wood");
  this.type=type;
  this.price=price;
  this.color=color;
 }
 
 Wood(String type, float price, String color,String use)
 {
  System.out.println("Invoking String, float, String const of Wood");
  this.type=type;
  this.price=price;
  this.color=color;
  this.use=use;
 }
 
 Wood(String type, float price, String color,String use, int length)
 {
  System.out.println("Invoking String, float, String const of Wood");
  this.type=type;
  this.price=price;
  this.color=color;
  this.use=use;
  this.length=length;
 }
}