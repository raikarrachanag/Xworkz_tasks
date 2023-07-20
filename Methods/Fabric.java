class Fabric{

 static double getPrice(String fabric)
 {
  System.out.println("Invoking getPrice in Fabric....");
  
  if(fabric!=null)
  {
   System.out.println("The Fabric is Valid");
   if("cotton"==fabric)
   {
    return 500;
   }
   if("nylon"==fabric)
   {
    return 300;
   }
   if("woolen"==fabric)
   {
    return 1000;
   }
   if("linen"==fabric)
   {
    return 2000;
   }
   if("Polyster"==fabric)
   {
    return 250;
   }
   if("silk"==fabric)
   {
    return 4500;
   }
  }
  else
  {
   System.err.println("The fabric is In Valid");
  }  
   return 0;
 }

}