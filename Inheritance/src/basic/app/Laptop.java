package basic.app;

public class Laptop extends Computer {
	public float price;

	public Laptop()
	{
		this.price=50000;
		System.out.println("Price of Laptop: "+this.price);
	}
	
	public String brand()
	{
		return "Dell";
	}
}
