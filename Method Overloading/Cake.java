class Cake{
 
 static void tasty(String name,String type, String bakeryName, float price, int noOfPieces, String occasion)
 {
  System.out.println("Invoking tasty from Cake");
  
  System.out.println("\n");
  
  System.out.println("Cake Name:" +name);
  System.out.println("Cake Type:" +type);
  System.out.println("Bakery Name:" +bakeryName);
  System.out.println("Cake Price:" +price);
  System.out.println("Number Of Pieces:" +noOfPieces);
  System.out.println("Occasion:" +occasion);
  
  System.out.println("\n");
  
  if(name!=null)
  {
	  System.out.println("Cake name is Valid");
  }
  else 
  {
	  System.err.println("Cake name is InValid");
	  return;
  }
  
  if(type!=null)
  {
	  System.out.println("Cake Type is Valid");
  }
  else
  {
	  System.err.println("Cake Type is InValid");
	  return;
  }
  
  if(bakeryName!=null)
  {
	  System.out.println("Bakery name is Valid");
  }
  else
  {
	  System.err.println("Bakery name is InValid");
	  return;
  }
  
  if(price>=50 && price<2000)
  {
	  System.out.println("Price is Valid");
  }
  else
  {
	  System.err.println("Price is InValid");
	  return;
  }
  
  if(noOfPieces<10)
  {
	  System.out.println("noOfPieces is Valid");
	  return;
  }
  else
  {
	  System.err.println("noOfPieces is InValid");
	
  }
  
  if(occasion!=null)
  {
	  System.out.println("occasion is Valid");
  }
  else
  {
	  System.err.println("occasion is InValid");
	  return;
  }
  
  
 }
}