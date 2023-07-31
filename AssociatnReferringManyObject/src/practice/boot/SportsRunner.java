package practice.boot;

import practice.app.Area;
import practice.app.Building;
import practice.app.Corporator;
import practice.app.Floor;
import practice.app.HomeTown;
import practice.app.Lift;
import practice.app.Player;
import practice.app.Sports;

public class SportsRunner {

	public static void main(String[] args) {
		
System.out.println("Running main in SportRunner");
		
		String name="Cricket";
		
		Lift lift=new Lift(1);
		Lift lift1=new Lift(2);
		
		Lift[] lifts= {lift,lift1};
		
		Floor floor=new Floor("Fisrt Floor",1);
		Floor floor1=new Floor("Second Floor",2);
		Floor floor2=new Floor("Third Floor",3);
		Floor floor3=new Floor("Fourth Floor",4);
		Floor floor4=new Floor("Fifth Floor",5);
		Floor floor5=new Floor("Sixth Floor",6);
		Floor floor6=new Floor("Seventh Floor",7);
		
		Floor[] floors= {floor,floor1,floor2,floor3,floor4,floor5,floor6};
		Building building=new Building(floors,lifts);
		Building building1=new Building(floors,lifts);
		
		Building[] buildings= {building,building1};
		
		Corporator corporator=new Corporator(buildings, "Shree");
		
		Area area=new Area("Bangalore",corporator);
		Area area1=new Area("Mumbai",corporator);
		
		Area[] areas= {area,area1};
		
		HomeTown town=new HomeTown("Bangalore",678976l,areas);
		
		Player player=new Player(building, "Virat", 10, town );
		Player player1=new Player(building1, "M S Dhoni",30,town);
		
		Player[] players= {player,player1};
		
		
		Sports sport=new Sports(name,players);
		sport.printInfo();

	}
}
