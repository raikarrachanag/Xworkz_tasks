class RocketRunner{

 public static void main(String[] args)
 {
  
  Rocket rocket=new Rocket();
  System.out.println("Invoking name in RocketRunner: " +rocket.name);
  System.out.println("Invoking weightInPounds in RocketRunner: " +rocket.weightInPounds);
  System.out.println("Invoking speedPerMiles in RocketRunner: " +rocket.speedPerMiles);
  
  System.out.println("====================================================================");
  
  Rocket rocket1=new Rocket();
  System.out.println("Invoking name in RocketRunner: " +rocket1.name);
  System.out.println("Invoking weightInPounds in RocketRunner: " +rocket1.weightInPounds);
  System.out.println("Invoking speedPerMiles in RocketRunner: " +rocket1.speedPerMiles);
  
  }
}