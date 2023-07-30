package practiceAssociation.app;

public class Garage {

	public String name;
	public Mechanic mechanic;
	
	public void repair()
	{
		System.out.println("Invoking repair in Garage");
		if(mechanic!=null)
		{
			this.mechanic.name();
		}
		else
		{
			System.out.println("mechanic is null, it not operate name() Method");
		}
	}
	public void wash()
	{
		System.out.println("Invoking wash in Garage");
		if(mechanic!=null)
		{
			this.mechanic.shop();
		}
		else
		{
			System.out.println("mechanic is null, it not operate shop() Method");
		}
	}
}
