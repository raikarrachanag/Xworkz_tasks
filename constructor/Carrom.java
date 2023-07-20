class Carrom{

 String name;
 String type;
 int maxPlayers;
 float price;
 String shape;
 
 Carrom()
 {
  System.out.println("Invoking const in Carrom");
 }
  
 Carrom(String name)
 {
  System.out.println("Invoking const arg in Carrom");
  System.out.println("Game Name: " +name);
  this.name=name;
  }
  
 Carrom(String name, String type)
 {
  System.out.println("Invoking const arg in Carrom");
  System.out.println("Game Name: " +name);
  System.out.println("Game type: " +type);
  this.name=name;
  this.type=type;
  }
  
  Carrom(String name, String type, int maxPlayers)
 {
  System.out.println("Invoking const arg in Carrom");
  System.out.println("Game Name: " +name);
  System.out.println("Game type: " +type);
  System.out.println("maximum players: " +maxPlayers);
  this.name=name;
  this.type=type;
  this.maxPlayers=maxPlayers;
  }
  
  Carrom(String name, String type, int maxPlayers, float price)
 {
  System.out.println("Invoking const arg in Carrom");
  System.out.println("Game Name: " +name);
  System.out.println("Game type: " +type);
  System.out.println("maximum players: " +maxPlayers);
  System.out.println("Price of Carrom Board: " +price);
  this.name=name;
  this.type=type;
  this.maxPlayers=maxPlayers;
  this.price=price;
  }
  
  Carrom(String name, String type, int maxPlayers, float price, String shape)
 {
  System.out.println("Invoking const arg in Carrom");
  System.out.println("Game Name: " +name);
  System.out.println("Game type: " +type);
  System.out.println("maximum players: " +maxPlayers);
  System.out.println("Price of Carrom Board: " +price);
  System.out.println("shape of Carrom Board: " +shape);
  this.name=name;
  this.type=type;
  this.maxPlayers=maxPlayers;
  this.price=price;
  this.shape=shape;
  }
 }