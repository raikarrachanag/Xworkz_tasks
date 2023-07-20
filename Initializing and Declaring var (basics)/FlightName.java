class FlightName{

public static void main(String[] args)
{
 System.out.println("Running main in Flight Names....");
 
 String emirates="Emirates";
 String britishAirways="Bristish Airways";
 String airAsia= "Air Asia";
 String indiGo= "IndiGo";
 String airIndiaExpress="Air India Express";
 String vistara= "Vistara";
 String aeroflot= "Aeroflot";
 
 String[] FlightNames={emirates, britishAirways,airAsia, indiGo, airIndiaExpress, vistara, aeroflot};
  
  int total= FlightNames.length;
  
  System.out.println("\n");
  
  System.out.println("Total Number of Flight Name are:" +total);
  System.out.println("\n");
  
  for(int position=0;position<FlightNames.length; position++)
  {
	  String ref=FlightNames[position];
	  System.out.println("The Flight Name is " +ref + " at the position of " +position );
  }
  System.out.println("\n");
  System.out.println("Item at postion 1, before change is " +FlightNames[1]);
  FlightNames[1]= "Gulf Air";
	
  System.out.println("Item at postion 1, After change is " +FlightNames[1]);
  System.out.println("\n");
  
  System.out.println("Item at postion 6, before change is " +FlightNames[6]);
  FlightNames[6]= "Finnair";
  System.out.println("Item at postion 6, After change is " +FlightNames[6]);
  System.out.println("\n");
 
  for(int position=FlightNames.length-1;position>=0; position--)
  {
	  String ref=FlightNames[position];
	  System.out.println("The Flight Name is " +ref + " at the position of " +position );
  }
  
  }}
 

 