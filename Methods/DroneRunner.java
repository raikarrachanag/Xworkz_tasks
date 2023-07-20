class DroneRunner{

 public static void main(String[] args)
 {
  System.out.println("Invoking main in DroneRunner");
  System.out.println("\n");
  
  double ref1=Drone.getDistanceByFlight("Aiden Kelly", "Wedding");
  System.out.println("The distance of drone fly while operated by Aiden Kelly in wedding:" +ref1);
  System.out.println("\n");
  
  double ref2=Drone.getDistanceByFlight("John", "Naming Ceremony");
  System.out.println("The distance of drone fly while operated by John in Naming Ceremony:" +ref2);
  System.out.println("\n");
  
  double ref3=Drone.getDistanceByFlight("Alexander", "Party");
  System.out.println("The distance of drone fly while operated by Alexander in Party:" +ref3);
  System.out.println("\n");
  
  double ref4=Drone.getDistanceByFlight("Charles", "Birthday");
  System.out.println("The distance of drone fly while operated by Charles in Birthday:" +ref4);
  System.out.println("\n");
  System.out.println("________________________________________________________________________________________________________________");
  
  double price1=Drone.getPricePerEvent("Wedding");
  System.out.println("The Price for Wedding Event is:" +price1);
  System.out.println("\n");
  
  double price2=Drone.getPricePerEvent("Naming Ceremony");
  System.out.println("The Price for Naming Ceremony Event is:" +price2);
  System.out.println("\n");
  
  double price3=Drone.getPricePerEvent("Party");
  System.out.println("The Price for Party Event is:" +price3);
  System.out.println("\n");
  
  double price4=Drone.getPricePerEvent("Birthday");
  System.out.println("The Price for Birthday Event is:" +price4);
  System.out.println("\n");
  System.out.println("________________________________________________________________________________________________________________");
  
  
  int discount1=Drone.getDiscountByEvent("Wedding", "Draupadi");
  System.out.println("The Discount to Draupadi for wedding event:" +discount1);
  System.out.println("\n");
  
  int discount2=Drone.getDiscountByEvent("Naming Ceremony", "Dushyale");
  System.out.println("The Discount to Dushyale for Naming Ceremony event:" +discount2);
  System.out.println("\n");
  
  int discount3=Drone.getDiscountByEvent("Birthday", "Soumithre");
  System.out.println("The Discount to Soumithre for Birthday event:" +discount3);
  System.out.println("\n");
  
  int discount4=Drone.getDiscountByEvent("Party", "Kousalye");
  System.out.println("The Discount to Kousalye for Party event:" +discount4);
 
  }}