package practice.app;

public class Corporator {

	public Building[] buildings;
	public String corname;
	
public Corporator(Building[] buildings, String corname)
{
	this.buildings=buildings;
	this.corname=corname;
}
public void printInfo()
{
	System.out.println("Info about Corporator");
	System.out.println("The Corporator name is " +this.corname);
	for(int index=0; index<this.buildings.length; index++)
	{
		Building ref=this.buildings[index];
		ref.printInfo();
		
	}
	
	
}
}
