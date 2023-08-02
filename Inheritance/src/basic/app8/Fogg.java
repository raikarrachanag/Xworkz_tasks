package basic.app8;

public class Fogg extends Perfume{

	public String name="Fogg";
	
public Fogg()
{
	System.out.println("no arguement const in Perfume");
}
public void flavour()
{
	System.out.println("The Perfume name is "+this.name);
}
}

