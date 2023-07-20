class Soda{

 static void digest(String type, String shopName, int quantity, float price)
 {
  System.out.println("Invoking digest in Soda....");
  System.out.println("\n");
  
  System.out.println("Soda Type:" +type);
  System.out.println("Shop Name:" +shopName);
  System.out.println("Quantity Of Soda in liters:" +quantity);
  System.out.println("Price Of Soda:" +price);
  System.out.println("\n");
  
  if(type!=null)
  {
	  System.out.println("type is Valid");
  }
  else
  {
	  System.err.println("type is InValid");
	  return;
  }

  if(shopName!=null)
  {
	  System.out.println("Shop Name is Valid");
  }
  else
  {
	  System.err.println("Shop Name is InValid");
	  return;
  }
  
    
  if(quantity>2)
  {
	  System.out.println("Quantity is Valid");
	  return;
	  
  }
  else
  {
	  System.err.println("Quantity is InValid");
	  
  }
  
  
  if(price>300)
  {
	  System.out.println("price is Valid");
	  
  }
  else
  {
	  System.out.println("price is InValid");
	  return;
  }
  }
}