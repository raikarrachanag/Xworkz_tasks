class Oven{

 static void heat(String brand, int temperature, String quality, double price)
 {
  System.out.println("Invoking heat in Oven....");
  System.out.println("\n");
  
  System.out.println("Oven Brand:" +brand);
  System.out.println("Temperature:" +temperature);
  System.out.println("Oven Quality:" +quality);
  System.out.println("Price Of Oven:" +price);
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
  
  if(temperature>50)
  {
	  System.out.println("Temperature is Valid");
	  return;
  }
  else
  {
	  System.err.println("Temperature is InValid");
	  
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
  
  if(price<3000)
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