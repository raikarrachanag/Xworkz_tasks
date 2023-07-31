package practice.app;

public class Building {

	public Floor[] floors;
	public Lift[] lifts;
	
public Building(Floor[] floors, Lift[] lifts)
{
	this.floors=floors;
	this.lifts=lifts;
}
public void printInfo()
{
	System.out.println("Info of Building");
	for(int pos=0; pos<this.floors.length; pos++)
	{
		Floor ref=this.floors[pos];
		ref.printInfo();
		System.out.println("The Floors are " +ref);
	}
	for(int index=0; index<this.lifts.length; index++)
	{
		Lift ref1=this.lifts[index];
		ref1.printInfo();
		
	}
	
}
}
