class Train{

 static String getTrainName(int trainNo)
 {
  System.out.println("Invoking getTrainName from Train....");
  
  if(trainNo!=0)
  {
    System.out.println("Train Number  is Valid");
	if(11013==trainNo)
	{
	 return "Coimbatore Express";
	}
	if(11014==trainNo)
	{
	 return "Lokmanya Tt Express";
	}
	if(12134==trainNo)
	{
	 return "Mumbai Express";
	}
	if(22691==trainNo)
	{
	 return "Rajdhani Express";
	}
  }
  else
  {
    System.out.println("Train Number is InValid");
  }
  return "NA";
}
}