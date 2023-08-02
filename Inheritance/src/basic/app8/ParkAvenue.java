package basic.app8;

public class ParkAvenue extends Perfume{
	public String name="ParkAvenue";
	
	public ParkAvenue()
	{
		System.out.println("no arguement const in Perfume");
	}
	public void flavour()
	{
		System.out.println("The Perfume name is "+this.name);
	}
}
