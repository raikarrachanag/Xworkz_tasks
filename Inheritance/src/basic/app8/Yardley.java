package basic.app8;

public class Yardley extends Perfume{
	public String name="Yardley";
	
	public Yardley()
	{
		System.out.println("no arguement const in Perfume");
	}
	public void flavour()
	{
		System.out.println("The Perfume name is "+this.name);
	}
}
