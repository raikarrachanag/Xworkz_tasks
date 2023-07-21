class HelmetRunner{

 public static void main(String[] args)
 {
  System.out.println("Invoking main in HelmetRunner");
  
  Helmet helmet = new Helmet("Helmet" ,"Hero", "Yellow", 2200);
  Helmet.printstatic();
  helmet.printInstance();
  
  Helmet helmet1 = new Helmet("Helmet", "Honda", "pink", 1888);
  Helmet.printstatic();
  helmet1.printInstance();
  
 }
 }