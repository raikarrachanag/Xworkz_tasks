class WirelessControllerRunner{

public static void main(String[] args)
{
 System.out.println("Invoking main in WirelessControllerRunner");
 
 WirelessController wirelessController=new WirelessController();
 System.out.println(wirelessController.shortForm);
 System.out.println(wirelessController.use);
 System.out.println(wirelessController.range);
 System.out.println(wirelessController.example);
 System.out.println(wirelessController.price);
 System.out.println("=============================================================================================================");
 
 String shortForm="WLC";
 String use="Connecting";
 String range="19-28ft";
 String example="Razer Wolverine V2 Pro";
 float price=2200;
 
 System.out.println("Print after Re-initializing");
 
 WirelessController wirelessController1=new WirelessController();
 System.out.println(shortForm);
 System.out.println(use);
 System.out.println(range);
 System.out.println(example);
 System.out.println(price);
 
 
 }}