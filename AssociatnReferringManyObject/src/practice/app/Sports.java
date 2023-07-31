package practice.app;

public class Sports {
 
	public String name;
	public Player[] players;
	

public Sports(String name, Player[] players)
{
	this.name=name;
	this.players=players;
}

public void printInfo()
{
	System.out.println("Info about Sports");
	System.out.println("The Sports Name :" +this.name);
	
	for(int pos=0; pos<this.players.length; pos++)
	{
		Player ref=this.players[pos];
		ref.printInfo();
		
	}
}
}