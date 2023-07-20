class Scanner{

 static void scan(String type, String typeOfCode, int noOfPayments, float price)
 {
  System.out.println("Invoking scan in Scanner....");
  System.out.println("\n");
  
  System.out.println("Type of Payment:" +type);
  System.out.println("Type Of Code:" +typeOfCode);
  System.out.println("no of Payment done:" +noOfPayments);
  System.out.println("Price:" +price);
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
  
  if(typeOfCode!=null)
  {
	  System.out.println("Code is Valid");
	  
  }
  else
  {
	  System.err.println("Code is InValid");
	  return;
  }
  
  if(noOfPayments>50)
  {
	  System.out.println("payment is Valid");
	  return;
  }
  else
  {
	  System.err.println("payment is InValid");
	  
  }
  
  if(price>50 && price<80)
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