class PersonInfo{

 static int getAgeByName(String name)
 {
  System.out.println("Invoking getAgeByName by PersonInfo");
  
  if(name!=null)
  {
   System.out.println("Age is Valid");
   if("Pradyumna"==name)
   {
    return 22;
   }
   if("Raman"==name)
   {
    return 25;
   }
   if("Kavana"==name)
   {
    return 15;
   }
   if("Sushma"==name)
   {
    return 32;
   }
   if("Raju"==name)
   {
    return 45;
   }
   if("Sangeetha"==name)
   {
    return 38;
   }
   if("manjunath"==name)
   {
    return 67;
   }
   if("Praveen"==name)
   {
    return 55;
   }
   if("Damini"==name)
   {
    return 64;
   }
   if("lahari"==name)
   {
    return 76;
   }
   
  }
  else
  {
   System.out.println("Age is In Valid");
  }
  return 0;
 }
 
 
 static String getEmailByName(String name)
 {
  System.out.println("Invoking getEmailByName by PersonInfo");
  
  if(name!=null)
  {
   System.out.println("email is Valid");
   if("Rachana"==name)
   {
    return "rachana@gmail.com";
   }
   if("Raman"==name)
   {
    return "raman@gmail.com";
   }
   if("Kavana"==name)
   {
    return "kavana@gmail.com";
   }
   if("Sushma"==name)
   {
    return "sushma@gmail.com";
   }
   if("Raju"==name)
   {
    return "raju@gmail.com";
   }
   if("Sangeetha"==name)
   {
    return "sangeetha@gmail.com";
   }
   if("Manjunath"==name)
   {
    return "manjunath@gmail.com";
   }
   if("Praveen"==name)
   {
    return "praveen@gmail.com";
   }
   if("Prajval"==name)
   {
    return "prajval@gmail.com";
   }
   if("Lahari"==name)
   {
    return "lahari@gmail.com";
   }
   
  }
  else
  {
	System.out.println("email is InValid");
  }
 return "NA";
}
}