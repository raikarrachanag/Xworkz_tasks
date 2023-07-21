class Butterfly{
 
 static int antennae;
 static int wings;
 int legs;
 String color;
 
 Butterfly()
 {
  System.out.println("Invoking const in Butterfly");
 }
 
 Butterfly(int antennae, int wings)
 { 
  System.out.println("Invoking const in Butterfly");
  this.antennae=antennae;
  this.wings=wings;
  }
  
 Butterfly(int antennae, int wings, int legs, String color)
 {
  System.out.println("Invoking const in Butterfly");
  this.antennae=antennae;
  this.wings=wings;
  this.legs=legs;
  this.color=color;
  }
  
  static void printstatic()
  {
   System.out.println("Invoking main in Butterfly");
   System.out.println(antennae);
   System.out.println(wings);
  }
  
  void printInstance()
  {
   System.out.println("Invoking main in Butterfly");
   System.out.println(legs);
   System.out.println(color);
  }
 }