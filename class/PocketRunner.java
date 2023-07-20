class PocketRunner{

 public static void main(String[] args)
 {
  System.out.println("Invoking main in PocketRunner");
  
  Pocket pocket= new Pocket();
  System.out.println(pocket.noOfPocket);
  System.out.println(pocket.typeOfPocket);
  System.out.println(pocket.color);
  System.out.println(pocket.use);
  System.out.println(pocket.pocketContains);
  System.out.println("================================================================================================================");
  
  
  int noOfPocket=4;
  String typeOfPocket="pocketi shirt";
  String color="blue";
  String use="to store";
  String pocketContains="money";
  
  Pocket pocket1=new Pocket();
  
  System.out.println(noOfPocket);
  System.out.println(typeOfPocket);
  System.out.println(color);
  System.out.println(use);
  System.out.println(pocketContains);
  
  }}