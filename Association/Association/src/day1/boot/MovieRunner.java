package day1.boot;

import day1.app.Auditor;
import day1.app.Company;
import day1.app.Movie;
import day1.app.Producer;

public class MovieRunner {

	public static void main(String[] args) {
		
		Movie movie=new Movie();
		String name=movie.name;
		System.out.println(name);
		String language=movie.language;
		System.out.println(language);
		
		Producer producer=new Producer();
		String budget=producer.budget;
		System.out.println(budget);
		double mobileNo=producer.mobileNo;
		System.out.println(mobileNo);
		
		Auditor auditor=new Auditor();
		String aadharNo=auditor.aadharNo;
		System.out.println(aadharNo);
		
		Company company = new Company();
		String cname=company.cname;
		System.out.println(cname);
		String location=company.location;
		System.out.println(location);
	}
}
