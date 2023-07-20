class Wood{

 String type;
 float price;
 String color;
 String use;
 int length;
  
 Wood()
 {
  super();
  System.out.println("Invoking const in Wood");
 }
 
 Wood(String type)
 {
  this();
  System.out.println("Invoking String Const of Wood");
  this.type=type;
 }
 
 Wood(String type, float price)
 {
  this(type); 
  System.out.println("Invoking String, float const of Wood");
  this.price=price;
 }
 
 Wood(String type, float price, String color)
 {
  this(type, price); 
  System.out.println("Invoking String, float, String const of Wood");
  this.color=color;
 }
 
 Wood(String type, float price, String color,String use)
 {
  this(type,price,color); 
  System.out.println("Invoking String, float, String const of Wood");
  this.use=use;
 }
 
 Wood(String type, float price, String color, String use, int length)
 {
  this(type, price, color , use);  
  System.out.println("Invoking String, float, String const of Wood");
  this.length=length;
 }
}