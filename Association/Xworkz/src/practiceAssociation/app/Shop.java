package practiceAssociation.app;

public class Shop {

	public String name;
	public Salesman salesman;
	
	public void purchase()
	{
		System.out.println("Invoking purchase in Shop");
		if(salesman!=null)
		{
		this.salesman.things();
		}
		else
		{
			System.out.println("Salesman is null, not to operate things() method");
		}
	}
	public void owner()
	{
		System.out.println("Invoking owner in Shop");
		if(salesman!=null)
		{
		this.salesman.sales();
		}
		else
		{
			System.out.println("Salesman is null, not to operate sales() method");
		}
	}

}
