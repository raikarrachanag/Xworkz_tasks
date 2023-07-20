class PowerBankRunner{

public static void main(String[] args)
{
 System.out.println("Invoking main in PowerBankRunner");
 
 PowerBank powerBank=new PowerBank();
 System.out.println(powerBank.color);
 System.out.println(powerBank.Brand);
 System.out.println(powerBank.price);
 System.out.println(powerBank.durability);
 System.out.println(powerBank.use);
 System.out.println("=============================================================================================================");
 
 String color="white";
 String Brand="RealMe";
 float price=2000;
 int durability=4;
 String use="to charge the device";
 
 System.out.println("Print after Re-initializing");
 
 PowerBank powerBank1=new PowerBank();
 System.out.println(color);
 System.out.println(Brand);
 System.out.println(price);
 System.out.println(durability);
 System.out.println(use);
 
 
 }}