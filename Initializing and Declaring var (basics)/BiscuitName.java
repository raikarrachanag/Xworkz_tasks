class BiscuitName{

public static void main(String[] args)
{
 System.out.println("Running main in Biscuit Name....");
 
 String parle="Parle-G";
 String oreo= "Oreo";
 String hideandSick= "Hide & Sick";
 String darkFantacy= "Dark Fantacy";
 String goodDay="Good Day";
 String marieGold= "Marie Gold";
 String chaskaMaska= "Chaska Maska";
 
 String[] BiscuitNames={parle, oreo, hideandSick, darkFantacy, goodDay, marieGold, chaskaMaska};
  
  int total= BiscuitNames.length;
  
  System.out.println("\n");
  
  System.out.println("Total Number of BiscuitName are:" +total);
  System.out.println("\n");
  
  for(int position=0;position<BiscuitNames.length; position++)
  {
	  String ref=BiscuitNames[position];
	  System.out.println("The Biscuit Name is " +ref + " at the position of " +position );
  }
  System.out.println("\n");
  System.out.println("Item at postion 1, before change is " +BiscuitNames[1]);
  BiscuitNames[1]= "BourBon";
	
  System.out.println("Item at postion 1, After change is " +BiscuitNames[1]);
  System.out.println("\n");
  
  System.out.println("Item at postion 6, before change is " +BiscuitNames[6]);
  BiscuitNames[6]= "Unibic Cookies";
  System.out.println("Item at postion 6, After change is " +BiscuitNames[6]);
  System.out.println("\n");
 
  for(int position=BiscuitNames.length-1;position>=0; position--)
  {
	  String ref=BiscuitNames[position];
	  System.out.println("The Grocery items is " +ref + " at the position of " +position );
  }
  
  }}
 

 