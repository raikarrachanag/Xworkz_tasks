class WeightMachine{

 static void weighs(String company, double price, int limitation, String type)
 {
  System.out.println("Invoking weighs in WeightMachine....");
  System.out.println("\n");
  
  System.out.println("Company:" +company);
  System.out.println("Price of WeightMachine:" +price);
  System.out.println("limitation of WeightMachine in grams:" +limitation);
  System.out.println("Type:" +type);
  System.out.println("\n");
  
  if(company!=null)
  {
	System.out.println("company is valid");  
  }
  else
  {
	System.err.println("company is InValid");
	return;
  }
  
  if(price<1999)
  {
	System.out.println("price is valid");  
	return;
  }
  else
  {
	System.err.println("price is InValid");
  }
  
  if(limitation>1 && limitation<200)
  {
	System.out.println("valid");  
  }
  else
  {
	System.err.println("InValid");
	return;
  }
  
  if(type!=null)
  {
	System.out.println("type is valid");  
  }
  else
  {
	System.err.println("type is InValid");
	return;
  }
  }}