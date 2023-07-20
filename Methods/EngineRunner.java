class EngineRunner{

 public static void main(String[] args)
 {
  System.out.println("Invoking main in EngineRunner");
  
  int ref1 = Engine.getCCByModel("Swift");
  System.out.println("Swift cc: " +ref1);
  System.out.println("\n");
  
  int ref2 = Engine.getCCByModel("Rapid");
  System.out.println("Rapid cc: " +ref2);
  System.out.println("\n");
  
  int ref3 = Engine.getCCByModel("BMW");
  System.out.println("BMW cc: " +ref3);
  System.out.println("\n");
  
  int ref4 = Engine.getCCByModel("Benz");
  System.out.println("Benz cc: " +ref4);
  System.out.println("\n");
  
  int ref5 = Engine.getCCByModel("Audi");
  System.out.println("Audi cc: " +ref5);
  System.out.println("\n");
  
  int ref6 = Engine.getCCByModel("Bentley");
  System.out.println("Bentley cc: " +ref6);
  System.out.println("\n");
  
  int ref7 = Engine.getCCByModel(null);
  System.out.println("null: " +ref7);
  System.out.println("\n");
  
  }
 }