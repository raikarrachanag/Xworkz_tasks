package practiceAssociation.app;

public class Browser {

	public String name;
	public Internet internet;
	public void search()
	{
		System.out.println("Invoking search in Browser");
		if(internet!=null)
		{
		this.internet.connect();
		}
		else
		{
			System.out.println("Internet is null, not operate connect() method");
		}
	}
	public void information()
	{
		System.out.println("Invoking info in Browser");
		if(internet!=null)
		{
		this.internet.network();
		}
		else
		{
			System.out.println("Internet is Null, not operate network() method");
		}
	}
}
