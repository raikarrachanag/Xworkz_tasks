package practice.app;

public class Player {

	public Building buildings;
	public String pname;
	public int experience;
	public HomeTown town;
	
public Player(Building building, String name, int experience, HomeTown town)
{
	this.buildings=building;
	this.pname=name;
	this.experience=experience;
	this.town=town;
}
public void printInfo()
{
	System.out.println("Info of Players");
	System.out.println("The player name :" +this.pname);
	System.out.println("Experience :" +this.experience);
	buildings.printInfo();
	town.printInfo();
}
	
	
}
