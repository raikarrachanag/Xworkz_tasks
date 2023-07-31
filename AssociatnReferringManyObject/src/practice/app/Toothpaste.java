package practice.app;

public class Toothpaste {

	public String name;
	public String brand;
	public String company;
	public String[] ingredients;
	
public Toothpaste(String name, String brand, String company, String[] ingredients)
{
	this.name=name;
	this.brand=brand;
	this.company=company;
	this.ingredients=ingredients;
}

public void printInfo()
{
	System.out.println("Printing Info Of Toothpaste");
	System.out.println("The Toothpaste name: "+this.name);
	System.out.println("Brand Of Toothpaste: "+this.brand);
	System.out.println("Company of Toothpaste: "+this.company);
	for(int index=0;index<this.ingredients.length; index++)
	{
		String ref=this.ingredients[index];
		System.out.println("The ingredient is "+ref + " at the index" +index);
	}
		
}
}
