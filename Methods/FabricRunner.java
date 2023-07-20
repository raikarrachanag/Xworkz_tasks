class FabricRunner{

 public static void main(String[] args)
 {
  System.out.println("Invoking main in FabricRunner....");
  
  double ref1=Fabric.getPrice("cotton");
  System.out.println("Ref1 from double from Fabric Method: " +ref1);
  System.out.println("\n");
  
  double ref2=Fabric.getPrice("nylon");
  System.out.println("Ref2 from double from Fabric Method: " +ref2);
  System.out.println("\n");
  
  double ref3=Fabric.getPrice("woolen");
  System.out.println("Ref3 from double from Fabric Method: " +ref3);
  System.out.println("\n");
  
  double ref4=Fabric.getPrice("linen");
  System.out.println("Ref4 from double from Fabric Method: " +ref4);
  System.out.println("\n");
  
  double ref5=Fabric.getPrice("Polyster");
  System.out.println("Ref5 from double from Fabric Method: " +ref5);
  System.out.println("\n");
  
  double ref6=Fabric.getPrice("silk");
  System.out.println("Ref6 from double from Fabric Method: " +ref6);
  System.out.println("\n");
  
  double ref7=Fabric.getPrice(null);
  System.out.println("Ref7 from double from Fabric Method: " +ref7);
  System.out.println("\n");
  
  double ref8=Fabric.getPrice("synthetic");
  System.out.println("Ref8 from double from Fabric Method: " +ref8);
  
  
  }}