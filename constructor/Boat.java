class Boat{

 String place;
 String color;
 int cost;
 
 Boat()
 {
  System.out.println("Invoking main in Boat");
  System.out.println("Inside the constructor: " +this.place);
  System.out.println("Inside the constructor: " +this.color);
  System.out.println("Inside the constructor: " +this.cost);
  
  this.place="Honnavara";
  this.color="Brown";
  this.cost=100;
  
  }
  Boat(String place, String color, int cost)
  {
   System.out.println("Invoking arguments in main");
   this.place=place;
   this.color=color;
   this.cost=cost;
   }
 }