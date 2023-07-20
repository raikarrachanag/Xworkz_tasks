class StadiumRunner{

 public static void main(String[] args)
 {
  System.out.println("Invoking main in StadiumRunner");
  
  Stadium stadium= new Stadium();
  System.out.println(stadium.noOfPeopleInStadium);
  System.out.println(stadium.location);
  System.out.println(stadium.type);
  System.out.println(stadium.size);
  System.out.println(stadium.stadiumName);
  System.out.println("================================================================================================================");
  
  
  int noOfPeopleInStadium=200;
  String location="Shivamogga";
  String type="cricket stadium";
  String size="5 hectare";
  String stadiumName="nehru";
  
  Stadium stadium1=new Stadium();
  
  System.out.println(noOfPeopleInStadium);
  System.out.println(location);
  System.out.println(type);
  System.out.println(size);
  System.out.println(stadiumName);
  
  }}