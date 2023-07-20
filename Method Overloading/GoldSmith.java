class GoldSmith{

 static void jewellrymaking(String jewellrytype, long goldPercentage, int wastage, double pricePerGram)
 {
  System.out.println("Invoking Jewellry making in GoldSmith....");
  System.out.println("\n");
  
  System.out.println("Type Of Jewellry:" +jewellrytype);
  System.out.println("Percentage of Gold:" +goldPercentage);
  System.out.println("Wastage:" +wastage);
  System.out.println("Price Of Gold Per Gram:" +pricePerGram);
  System.out.println("\n");
  
  if(jewellrytype!=null)
  {
	  System.out.println("jewellry Type is Valid");
  }
  else
  {
	  System.err.println("Jewellry Type is InValid");
	  return;
  }
  
  if(goldPercentage>85)
  {
	  System.out.println("Gold Percentage is Valid");
	  
  }
  else
  {
	  System.err.println("Gold Percentage is InValid");
	  return;
  }
  
  if(wastage<10)
  {
	  System.out.println("Wastage is Valid");
  }
  else
  {
	  System.err.println("Wastage is InValid");
	  return;
  }
  
  if(pricePerGram>4000 && pricePerGram<=5000)
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