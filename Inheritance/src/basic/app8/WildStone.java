package basic.app8;

public class WildStone extends Perfume {
	public String name="WildStone";
	
	public WildStone()
	{
		System.out.println("no arguement const in Perfume");
	}
	public void flavour()
	{
		System.out.println("The Perfume name is "+this.name);
	}
}
