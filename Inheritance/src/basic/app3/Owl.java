package basic.app3;

public class Owl extends Bird{
	
	public String color;

	public Owl()
	{
		this.color="Brown";
		System.out.println("Color of Bird is "+this.color);
	}
	public int noOfChildrens()
	{
		return 4;
	}
}
