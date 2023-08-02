package basic.app2;

public class Cow extends Animal {
	
	public String type;
	
public Cow()
{
	this.type="Jersey Cow";
	System.out.println("Number of Children:" +this.type);
}

public int noOfChildrens()
{
	return 2;
}

}
