class Brick{

 static String color;
 static int weight;
 int noOfBricks;
 float price;
 
 Brick()
 {
  super();
  System.out.println("Invoking const of Brick");
 }
 
 Brick(String color, int weight)
 {
  System.out.println("Invoking String, int const of Brick ");
  this.color=color;
  this.weight=weight;
 }
 
 Brick(String color, int weight, int noOfBricks, float price)
 {
  System.out.println("Invoking String, int , int, float const of Brick ");
  this.color=color;
  this.weight=weight;
  this.noOfBricks=noOfBricks;
  this.price=price;
  }
  
 static void printstatic()
 {
  System.out.println("invoking main in Brick ");
  System.out.println(color);
  System.out.println(weight);
  }
  
  void printInstance()
 {
  System.out.println("invoking main in Brick ");
  System.out.println(noOfBricks);
  System.out.println(price);
  }
  
}