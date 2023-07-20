class JacketRunner{
 
public static void main(String[] args)
{
	
 System.out.println("Invoking main in JacketRunner");
 Jacket jacket=new Jacket();
 System.out.println(jacket.color);
 System.out.println(jacket.brand);
 System.out.println(jacket.size);
 System.out.println(jacket.jacketOwner);
 System.out.println(jacket.price);
 System.out.println("=============================================================================================");
 
 String color="Brown";
 String brand="Louis Phillippi";
 int size=34;
 String jacketOwner="Duryodhana";
 double price=1000.0;
 
 System.out.println("Print after Re-initializing");
 Jacket jacket1=new Jacket();//optional
 System.out.println(color);
 System.out.println(brand);
 System.out.println(size);
 System.out.println(jacketOwner);
 System.out.println(price);
 
 }
 }