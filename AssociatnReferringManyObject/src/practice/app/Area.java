package practice.app;

public class Area {

	public String aname;
	public Corporator corporator;
	
public Area(String aname, Corporator corporator)
{
	this.aname=aname;
	this.corporator=corporator;
}
public void printInfo()
{
	System.out.println("Info about Area");
	System.out.println("The Area is :" +this.aname);
	System.out.println("The Corporator Name is :" +this.corporator);
}
}
