package practiceAssociation.app;

public class Hotel {
	
	public String name;
	public Cook cook;

	public void food()
	{
		System.out.println("Invoking food in Hotel");
		if(cook!=null)
		{
		this.cook.server();
		}
		else
		{
			System.out.println("cook is null, hence it not operate server() method");
		}
	}
	public void owner()
	{
		System.out.println("Invoking owner in Hotel");
		if(cook!=null)
		{
		this.cook.tastyFood();
		}
		else
		{
			System.out.println("cook is null, hence is not operate owner() method");
		}
	}
}
