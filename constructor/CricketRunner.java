class CricketRunner{

 public static void main(String[] args)
 {
 Cricket cricket=new Cricket();
  System.out.println("Invoking name in CricketRunner: " +cricket.name);
  System.out.println("Invoking place in CricketRunner: " +cricket.place);
  System.out.println("Invoking age in CricketRunner: " +cricket.age);
  
  System.out.println("====================================================================");
  
  Cricket cricket1=new Cricket("KL Rahul", "Karnataka", 30);
  System.out.println("invoking name in CricketRunner: " +cricket1.name);
  System.out.println("invoking place in CricketRunner: " +cricket1.place);
  System.out.println("invoking age in BoatRunner: " +cricket1.age);
  }}