class TrainRunner{

 public static void main(String[] args)
 {
  System.out.println("Invoking main in TrainRunner");
  
  String ref1=Train.getTrainName(11013);
  System.out.println("11013: " +ref1);
  System.out.println("\n");
  
  String ref2=Train.getTrainName(11014);
  System.out.println("11014: " +ref2);
  System.out.println("\n");
  
  String ref3=Train.getTrainName(12134);
  System.out.println("12134: " +ref3);
  System.out.println("\n");
  
  String ref4=Train.getTrainName(22691);
  System.out.println("22691: " +ref4);
  System.out.println("\n");
  
  String ref5=Train.getTrainName(0);
  System.out.println("0: " +ref5);
  
  }}