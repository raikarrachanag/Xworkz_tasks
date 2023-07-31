package practice.app;

public class Ingredients {

	public String name;
	public int quantity;
	public float cost;
	
public Ingredients(String name, int quantity, float cost)
{
	 this.name=name;
	 this.quantity=quantity;
	 this.cost=cost;
}
public void printInfo()
{
	System.out.println("Info of Ingredients");
	System.out.println(this.name);
	System.out.println(this.quantity);
	System.out.println(this.cost);
}
}
