class Drone{
 
 static double getDistanceByFlight(String operator, String event)
 {
  System.out.println("Invoking getDistanceByFlight in Drone");
  
  if(operator!=null && event!=null)
  {
   System.out.println("Operator and event is Valid");
   if("Aiden Kelly"==operator && "Wedding"==event)
   {
	   return 2;
   }
   if("John"==operator && "Naming Ceremony"==event)
   {
	   return 0.6;
   }
   if("Alexander"==operator && "Party"==event)
   {
	   return 2.5;
   }
   if("Charles"==operator && "Birthday"==event)
   {
	   return 1;
   }
   
  }
   else
   {
   System.err.println("Operator and event is in-valid");
   
   }
   return 0;
 }
 
 static double getPricePerEvent(String eventName)
 {
	 System.out.println("Invoking getPricePerEvent in Drone");
	 
	 if(eventName!=null)
	 {
		 System.out.println("Event Name is Valid");
		 if("Wedding"==eventName)
		 {
			 return 50000;
		 }
		 if("Naming Ceremony"==eventName)
		 {
			 return 20000;
		 }
		 if("Party"==eventName)
		 {
			 return 18000;
		 }
		 if("Birthday"==eventName)
		 {
			 return 10000;
		 }
	 }
	 else
	 {
		 System.out.println("Event name is In valid");
	 }
	 return 0;
 }
 static int getDiscountByEvent(String eventName, String refPerson)
 {
	 System.out.println("Invoking getDiscountByEvent in Drone");
	 
	 if(eventName!=null && refPerson!=null)
	 {
		 System.out.println("Event Name and Referred Person is Valid");
		 if("Wedding"==eventName && "Draupadi"==refPerson)
		 {
			 return 20;
		 }
		 if("Naming Ceremony"==eventName && "Dushyale"==refPerson)
		 {
			 return 10;
		 }
		 
		 if("Birthday"==eventName && "Soumithre"==refPerson)
		 {
			 return 12;
		 }
		 if("Party"==eventName && "Kousalye"==refPerson)
		 {
			 return 22;
		 }
	 }
	 else
	 {
		 System.out.println("Event Name and Referred Person is InValid");
	 }
	  return -1;
	 
 }
}