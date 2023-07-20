class CarpenterRunner{

 public static void main(String[] args){
 
  Carpenter.work();
  System.out.println("\n");
  
  Carpenter.work("Raman");
  System.out.println("\n");
  
  Carpenter.work('M');
  System.out.println("\n");
  
  Carpenter.work(10);
  System.out.println("\n");
  
  Carpenter.work(10.00f);
  System.out.println("\n");
  
  Carpenter.wakes();
  System.out.println("\n");
  
  Carpenter.wakes("wood");
  System.out.println("\n");
  
  Carpenter.wakes(2);
  System.out.println("\n");
  
  Carpenter.wakes(10.5f);
  System.out.println("\n");
  
  Carpenter.wakes(3);
  System.out.println("\n");
  
  Carpenter.cut();
  System.out.println("\n");
  
  Carpenter.sleep();
  
  }
 }