class BoatRunner{

 public static void main(String[] args)
 {
  Boat boat=new Boat();
  System.out.println("invoking place in BoatRunner: " +boat.place);
  System.out.println("invoking color in BoatRunner: " +boat.color);
  System.out.println("invoking cost in BoatRunner: " +boat.cost);
  
  System.out.println("====================================================================");
  
  Boat boat1=new Boat("Upponi", "Brown", 250);
  System.out.println("invoking place in BoatRunner: " +boat1.place);
  System.out.println("invoking color in BoatRunner: " +boat1.color);
  System.out.println("invoking cost in BoatRunner: " +boat1.cost);
  }}