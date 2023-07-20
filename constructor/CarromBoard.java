class CarromBoard{

 public static void main(String[] args)
 {
  Carrom carrom = new Carrom();
  System.out.println(carrom.name);
  System.out.println(carrom.type);
  System.out.println(carrom.maxPlayers);
  System.out.println(carrom.price);
  System.out.println(carrom.shape);
  
  System.out.println("========================================");
  
  Carrom carrom1 = new Carrom("Carrom");
  System.out.println(carrom1.name);
  
  System.out.println("========================================");
  
  Carrom carrom2 = new Carrom("Carrom", "Indoor Game");
  System.out.println(carrom2.name);
  System.out.println(carrom2.type);
  
  System.out.println("========================================");
  
  Carrom carrom3 = new Carrom("Carrom" , "Indoor Game", 4);
  System.out.println(carrom3.name);
  System.out.println(carrom3.type);
  System.out.println(carrom3.maxPlayers);
  
  System.out.println("========================================");
  
  Carrom carrom4 = new Carrom("Carrom" , "Indoor Game", 4, 2000);
  System.out.println(carrom4.name);
  System.out.println(carrom4.type);
  System.out.println(carrom4.maxPlayers);
  System.out.println(carrom4.price);
  
  System.out.println("========================================");
  
  Carrom carrom5 = new Carrom("Carrom" , "Indoor Game", 4, 2000, "Square");
  System.out.println(carrom5.name);
  System.out.println(carrom5.type);
  System.out.println(carrom5.maxPlayers);
  System.out.println(carrom5.price);
  System.out.println(carrom5.shape);
  
  System.out.println("========================================");
  
  
  
 }}