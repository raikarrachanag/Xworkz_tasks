class Rocket{

 String name;
 double weightInPounds;
 double speedPerMiles;
 
 Rocket()
 {
   System.out.println("Invoking constructor in Rocket");
   System.out.println("Inside the constructor: " +this.name);
   System.out.println("Inside the constructor: " +this.weightInPounds);
   System.out.println("Inside the constructor: " +this.speedPerMiles);
   
   this.name="Zipper";
   this.weightInPounds=850000;
   this.speedPerMiles=15000;
   
   }
  Rocket(String name, double weightInPounds, double speedPerMiles)
  {
   System.out.println("Invoking const argument in Rocket");
   this.name=name;  //this will initialize instance variable to local variable
   this.weightInPounds=weightInPounds;
   this.speedPerMiles=speedPerMiles;
   }
   }