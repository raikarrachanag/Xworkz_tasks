class Kulfi{

 static void taste(String type, int noOfKulfi, String shopName, float price)
 {
  System.out.println("Invoking taste in Kulfi....");
  System.out.println("\n");
  
  System.out.println("Kulfi Type:" +type);
  System.out.println("No Of Kulfies:" +noOfKulfi);
  System.out.println("Shop Name:" +shopName);
  System.out.println("Price Of Kulfi:" +price);
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
  
  if(noOfKulfi>10)
  {
	  System.out.println("Valid");
	  
  }
  else
  {
	  System.err.println("InValid");
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
  
  if(price<200)
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