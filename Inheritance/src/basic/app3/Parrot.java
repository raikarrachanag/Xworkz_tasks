package basic.app3;

public class Parrot extends Bird {

	public String color;
	
public Parrot()
{
	this.color="Green";
	System.out.println("The color of Bird is "+this.color);
	
}
public int noOfChildrens()
{
	return 6;
}
}
