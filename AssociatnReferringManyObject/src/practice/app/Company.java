package practice.app;

public class Company {

	public String cname;
	public String ceo;
	public String originCountry;
	
public Company(String name, String ceo, String originCountry)
{
	this.cname=name;
	this.ceo=ceo;
	this.originCountry=originCountry;
}

public  void printInfo()
{
	System.out.println("Info of Company");
	System.out.println("The Company Name Of colgate: "+this.cname);
	System.out.println("The CEO of Colgate :" +this.ceo);
	System.out.println("The Origin Country of Colgate: "+this.originCountry);
 }
}
