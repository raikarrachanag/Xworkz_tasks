package day1.boot;

import day1.app.Constituency;
import day1.app.IndiraCanteen;
import day1.app.Minister;

public class MinisterRunner {

	public static void main(String[] args) {
		
		Minister minister=new Minister();
		String name=minister.name;
		System.out.println(name);
		int experience=minister.experience;
		System.out.println(experience);
		
		Constituency constituency = new Constituency();
		int number=constituency.number;
		System.out.println(number);
		String population= constituency.population;
		System.out.println(population);
		
		IndiraCanteen indiracanteen =new IndiraCanteen();
		float breakFastPrice=indiracanteen.breakFastPrice;
		System.out.println(breakFastPrice);
		float lunchPrice=indiracanteen.lunchPrice;
		System.out.println(lunchPrice);
	}
}
