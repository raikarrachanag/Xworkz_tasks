class Job{

  static void apply()
  {
   System.out.println("Running apply in Job....");
   System.out.println("\n");
  }
  static void apply(String personName, int experience)
  {
   System.out.println("Person Name:" +personName);
   System.out.println("Person Experience:" +experience);
   System.out.println("\n");
  }
   static void apply(String personName, int experience, String refName)
  {
   System.out.println("Person Name:" +personName);
   System.out.println("Person Experience:" +experience);
   System.out.println("Reference By:" +refName);
   System.out.println("\n");
  }
  static void apply(int experience)
  { 
   System.out.println("Experience:" +experience);  
   System.out.println("\n");
   
  }
  static void rejectOffer()
  {
   System.out.println("Running rejectOffer in Job....");
  }
 }
 
 