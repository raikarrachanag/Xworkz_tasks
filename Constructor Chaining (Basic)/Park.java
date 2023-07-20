class Park{

 String name;
 String location;
 float priceOfTicket;
 int noOfPeople;
 int noOfGames;
 String openingTime;
 String closingTime;
 int noOfTrees;
 String area;
 
 Park()
 {
  super();
  System.out.println("Invoking const in Park");
 }
 
 Park(String name)
 {
 this();
 System.out.println("Invoking String const in Park");
 this.name=name;
 }
 
 Park(String name, String location)
 {
 this(name);
 System.out.println("Invoking String, String const in Park");
 this.location=location;
 }
 
 Park(String name, String location, float priceOfTicket)
 {
 this(name, location);
 System.out.println("Invoking String, String, float const in Park");
 this.priceOfTicket=priceOfTicket;
 }
 
 Park(String name, String location, float priceOfTicket, int noOfPeople)
 {
 this(name, location, priceOfTicket);
 System.out.println("Invoking String, String, float, int const in Park");
 this.noOfPeople=noOfPeople;
 }
 
 Park(String name, String location, float priceOfTicket, int noOfPeople, int noOfGames)
 {
 this(name, location, priceOfTicket, noOfPeople);
 System.out.println("Invoking String, String, float, int, int const in Park");
 this.noOfGames=noOfGames;
 }
 
 Park(String name, String location, float priceOfTicket, int noOfPeople, int noOfGames, String openingTime)
 {
 this(name, location, priceOfTicket, noOfPeople, noOfGames);
 System.out.println("Invoking String, String, float, int, int, String const in Park");
 this.openingTime=openingTime;
 }
 
 Park(String name, String location, float priceOfTicket, int noOfPeople, int noOfGames, String openingTime, String closingTime)
 {
 this(name, location, priceOfTicket, noOfPeople, noOfGames, openingTime);
 System.out.println("Invoking String, String, float, int, int, String, String const in Park");
 this.closingTime=closingTime;
 }
 
 Park(String name, String location, float priceOfTicket, int noOfPeople, int noOfGames, String openingTime, String closingTime, int noOfTrees)
 {
 this(name, location, priceOfTicket, noOfPeople, noOfGames, openingTime, closingTime);
 System.out.println("Invoking String, String, float, int, int, String, String, int const in Park");
 this.noOfTrees=noOfTrees;
 }
 
 Park(String name, String location, float priceOfTicket, int noOfPeople, int noOfGames, String openingTime, String closingTime, int noOfTrees, String area)
 {
 this(name, location, priceOfTicket, noOfPeople, noOfGames, openingTime, closingTime, noOfTrees);
 System.out.println("Invoking String, String, float, int, int, String, String, int, String const in Park");
 this.area=area;
 }
}