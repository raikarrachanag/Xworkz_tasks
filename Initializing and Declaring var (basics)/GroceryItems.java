class GroceryItems{

 public static void main(String[] args){
  System.out.println("Running main in GroceryItems....");
  
  String wheat= "Wheat";
  String ragi= "Ragi";
  String oil= "Cooking Oil";
  String rice= "Basmati Rice";
  String milk= "Nandini Milk";
  String Teapowder= "Tea Powder";
  String Coffeepowder= "Coffee Powder";
  
  String[] GroceryItems={wheat, ragi, oil, rice, milk, Teapowder, Coffeepowder};
  
  int total= GroceryItems.length;
  
  System.out.println("\n");
  
  System.out.println("Total Number of GroceryItems are:" +total);
  System.out.println("\n");
  
  for(int position=0;position<GroceryItems.length; position++)
  {
	  String ref=GroceryItems[position];
	  System.out.println("The Grocery items is " +ref + " at the position of " +position );
  }
  System.out.println("\n");
  System.out.println("Item at postion 2, before change is " +GroceryItems[2]);
  GroceryItems[2]= "Coconut Oil";
	
  System.out.println("Item at postion 2, After change is " +GroceryItems[2]);
  System.out.println("\n");
  
  System.out.println("Item at postion 6, before change is " +GroceryItems[6]);
  GroceryItems[6]= "Kashaya Powder";
  System.out.println("Item at postion 6, After change is " +GroceryItems[6]);
  System.out.println("\n");
 
  for(int position=GroceryItems.length-1;position>=0; position--)
  {
	  String ref=GroceryItems[position];
	  System.out.println("The Grocery items is " +ref + " at the position of " +position );
  }
  
  }}