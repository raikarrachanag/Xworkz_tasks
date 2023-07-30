package day1.boot;

import day1.app.Country;
import day1.app.HomeMinister;
import day1.app.PersonalAssistant;
import day1.app.President;
import day1.app.PrimeMinister;
import day1.app.SecurityHead;

public class CountryRunner {

	public static void main(String[] args) {
		
		Country country=new Country();
		String co_name=country.co_name;
		System.out.println(co_name);
		double code=country.code;
		System.out.println(code);
		
		President president= new President();
		String stateFrom = president.stateFrom;
		System.out.println(stateFrom);
		
		PrimeMinister primeminister = new PrimeMinister();
		double salary=primeminister.Salary;
		System.out.println(salary);
		int duration=primeminister.duration;
		System.out.println(duration);
		
		SecurityHead security=new SecurityHead();
		String qualification=security.qualification;
		System.out.println(qualification);
		int experience=security.experience;
		System.out.println(experience);
		
		PersonalAssistant assistant=new PersonalAssistant();
		String skills=assistant.skills;
		System.out.println(skills);
		String role=assistant.role;
		System.out.println(role);
		
		HomeMinister minister=new HomeMinister();
		String power=minister.power;
		System.out.println(power);
		String Hqualification=minister.Hqualification;
		System.out.println(Hqualification);
		
		
	}
}
