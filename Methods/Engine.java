class Engine{

 static int getCCByModel(String model)
 {
  System.out.println("Invoking getCCByModel from Engine");
  
  if(model!=null)
   {
    System.out.println("Car Model is Valid");
	if("Swift"==model)
	{
		return 1197;
	}
	if("Rapid"==model)
	{
		return 999;
	}
	if("BMW"==model)
	{
		return 2998;
	}
	if("Benz"==model)
	{
		return 1496;
	}
	if("Audi"==model)
	{
		return 1998;
	}
	if("Bentley"==model)
	{
		return 5998;
	}
   }
   else
   {
    System.err.println("Car Model is In Valid");
	
   }
   return 0;
 }
 }
 
 