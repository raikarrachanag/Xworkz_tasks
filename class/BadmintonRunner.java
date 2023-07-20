class BadmintonRunner{

 public static void main(String[] args)
 {
  System.out.println("Invoking main in BadmintonRunner");
  
  Badminton badminton= new Badminton();
  System.out.println(badminton.noOfPlayers);
  System.out.println(badminton.courtShape);
  System.out.println(badminton.type);
  System.out.println(badminton.inventedAt);
  System.out.println(badminton.yearOfInvention);
  System.out.println("================================================================================================================");
  
  
  int noOfPlayers=4;
  String courtShape="rectangle Shape";
  String type="Indoor Game";
  String inventedAt="England";
  long yearOfInvention=1873;
  
  Badminton stadium1=new Badminton();
  
  System.out.println(noOfPlayers);
  System.out.println(courtShape);
  System.out.println(type);
  System.out.println(inventedAt);
  System.out.println(yearOfInvention);
  
  }}