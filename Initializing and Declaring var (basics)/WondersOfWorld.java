class WondersOfWorld{

 public static void main(String[] args){
  System.out.println("Running main in Wonders Of World....");
  
  String india= "Taj Mahal";
  String italy= "The Colosseum";
  String china= "The Great Wall Of China";
  String mexico= "Chichen Itza";
  String jordan= "The Khaznah, Pera";
  String peru= "Machu Picchu";
  String brazil= "Christ the Redeemer";
  
  String[] WondersOfWorld={india, italy, china, mexico, jordan, peru, brazil};
  
  int total= WondersOfWorld.length;
  
  System.out.println("\n");
  
  System.out.println("Total Number of Wonders Of World are:" +total);
  System.out.println("\n");
  
  for(int position=0;position<WondersOfWorld.length; position++)
  {
	  String ref=WondersOfWorld[position];
	  System.out.println("The Wonders Of World is " +ref + " at the position of " +position );
  }
  System.out.println("\n");
  System.out.println("Item at postion 2, before change is " +WondersOfWorld[2]);
  WondersOfWorld[2]= "Eiffel Tower";
	
  System.out.println("Item at postion 2, After change is " +WondersOfWorld[2]);
  System.out.println("\n");
  
  System.out.println("Item at postion 6, before change is " +WondersOfWorld[4]);
  WondersOfWorld[4]= "Victoria Falls";
  System.out.println("Item at postion 6, After change is " +WondersOfWorld[4]);
  System.out.println("\n");
 
  for(int position=WondersOfWorld.length-1;position>=0; position--)
  {
	  String ref=WondersOfWorld[position];
	  System.out.println("The Wonders Of World is " +ref + " at the position of " +position );
  }
  
 }
}