class MetroRunner{

public static void main(String[] args)
{
 System.out.println("Invoking main in MetroRunner");
 
 Metro metro=new Metro();
 System.out.println(metro.distanceInKm);
 System.out.println(metro.location);
 System.out.println(metro.price);
 System.out.println(metro.line);
 System.out.println(metro.speedPerhr);
 System.out.println("=============================================================================================================");
 
 int distanceInKm=10;
 String location="Jalahalli";
 int price=17;
 String line="Green Line";
 int speedPerhr=120;
 
 System.out.println("Print after Re-initializing");
 Metro metro1=new Metro();
 System.out.println(distanceInKm);
 System.out.println(location);
 System.out.println(price);
 System.out.println(line);
 System.out.println(speedPerhr);
 
 
 }}