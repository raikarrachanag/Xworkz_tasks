class Stove{

 static void cook(String brand, int noOfBurner, String quality, double price)
 {
  System.out.println("Invoking cook in Stove....");
  System.out.println("\n");
  
  System.out.println("Stove Brand:" +brand);
  System.out.println("no Of Burners:" +noOfBurner);
  System.out.println("Stove Quality:" +quality);
  System.out.println("Price Of stove:" +price);
  System.out.println("\n");
  
  if(brand!=null)
  {
	  System.out.println("Brand is Valid");
  }
  else
  {
	  System.err.println("Brand is InValid");
	  return;
  }
  
  if(noOfBurner>1 && noOfBurner<4)
  {
	  System.out.println("Burners are Valid");
	  return;
  }
  else
  {
	  System.err.println("Burners are InValid");
	  
  }
  
  if(quality!=null)
  {
	  System.out.println("Quality is Valid");
  }
  else
  {
	  System.err.println("Quality is InValid");
	  return;
  }
  
  if(price>5000 && price<10000)
  {
	  System.out.println("price is Valid");
	  return;
  }
  else
  {
	  System.out.println("price is InValid");
	  
  }
  }
}