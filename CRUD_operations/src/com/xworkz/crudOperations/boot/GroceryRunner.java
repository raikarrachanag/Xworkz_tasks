package com.xworkz.crudOperations.boot;

import com.xworkz.crudOperations.app.repository.ArtistRepository;
import com.xworkz.crudOperations.app.repository.ArtistRepositoryImpl;
import com.xworkz.crudOperations.app.repository.GroceryRepository;
import com.xworkz.crudOperations.app.repository.GroceryRepositoryImpl;
import com.xworkz.crudOperations.app.repository.HistoricalPlaceRepositoryImpl;
import com.xworkz.crudOperations.app.repository.HistoricalPlacesRepository;
import com.xworkz.crudOperations.app.repository.JacketRepository;
import com.xworkz.crudOperations.app.repository.JacketRepositoryImpl;
import com.xworkz.crudOperations.app.repository.MedicineRepository;
import com.xworkz.crudOperations.app.repository.MedicineRepositoryimpl;
import com.xworkz.crudOperations.app.repository.PatientRepository;
import com.xworkz.crudOperations.app.repository.PatientRepositoryImpl;
import com.xworkz.crudOperations.app.repository.PilotRepository;
import com.xworkz.crudOperations.app.repository.PilotRepositoryImpl;
import com.xworkz.crudOperations.app.repository.PoliticianRepository;
import com.xworkz.crudOperations.app.repository.PoliticianRepositoryImpl;

public class GroceryRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in GroceryRunner");
		GroceryRepository repo = new GroceryRepositoryImpl();
		repo.save("Rice");
		repo.save("Wheat");
		repo.save("Chilli");
		repo.save("Carrot");
		repo.save("Moong Dal");
		repo.save("Pepper");
		repo.save("Jeera");
		repo.save("Beetroot");
		repo.save("Apple");
		repo.save("Orange");
		System.out.println("\n");

		JacketRepository jacket=new JacketRepositoryImpl();
		jacket.jackets("Puma");
		jacket.jackets("Reebok");
		jacket.jackets("Adidas");
		jacket.jackets("Allen Solly");
		jacket.jackets("Levi's");
		jacket.jackets("Nike");
		jacket.jackets("Gucci");
		jacket.jackets("Wow");
		jacket.jackets("Fila");
		jacket.jackets("FashionNova");
		System.out.println("\n");
		
		PoliticianRepository politician=new PoliticianRepositoryImpl();
		politician.names("Rahul Gandhi");
		politician.names("Rajiv Gandhi");
		politician.names("Siddaramaiah");
		politician.names("Indira Gandhi");
		politician.names("DK Shivakumar");
		politician.names("B.S Yadiyurappa");
		politician.names("G.M Siddeshwar");
		politician.names("Mallikarjun Kharge");
		politician.names("Prathibha Patil");
		politician.names("Manmohan Singh");
		System.out.println("\n");
		
		ArtistRepository artist=new ArtistRepositoryImpl();
		artist.items("Pencil");
		artist.items("Pen");
		artist.items("Color");
		artist.items("Crance");
		artist.items("Water Color");
		artist.items("Shading Pencil");
		artist.items("Scale");
		artist.items("Paper");
		artist.items("Plywood");
		System.out.println("\n");
		
		PilotRepository pilot=new PilotRepositoryImpl();
		pilot.Pilot_Names("Neil Armstrong");
		pilot.Pilot_Names("Erich Hartmann");
		pilot.Pilot_Names("Charles E.Yeager");
		pilot.Pilot_Names("Charles A.Lindberg");
		pilot.Pilot_Names("Scott Crossfield");
		pilot.Pilot_Names("Jimmy Doolittle");
		pilot.Pilot_Names("Pappy Boyington");
		pilot.Pilot_Names("Noel Wien");
		pilot.Pilot_Names("George Beurling");
		pilot.Pilot_Names("Adolph Malan");
		pilot.Pilot_Names("Buzz Aldrin");
		pilot.Pilot_Names("Pancho Barnes");
		System.out.println("\n");
		
		PatientRepository patient=new PatientRepositoryImpl();
		patient.care("Patient 1");
		patient.care("Patient 2");
		patient.care("Patient 3");
		patient.care("Patient 4");
		patient.care("Patient 5");
		patient.care("Patient 6");
		patient.care("Patient 7");
		patient.care("Patient 8");
		patient.care("Patient 9");
		patient.care("Patient 10");
		patient.care("Patient 11");
		System.out.println("\n");
		
		HistoricalPlacesRepository place=new HistoricalPlaceRepositoryImpl();
		place.venue("Mysore");
		place.venue("Badami");
		place.venue("Aihole");
		place.venue("Halebidu");
		place.venue("Shimoga");
		place.venue("Dandeli");
		place.venue("Hampi");
		place.venue("Srirangapatna");
		place.venue("Banglore");
		place.venue("Beluru");
		place.venue("Channagiri");
		System.out.println("\n");
		
		MedicineRepository medicine=new MedicineRepositoryimpl();
		medicine.list("Naproxen");
		medicine.list("Paracetomol");
		medicine.list("Diazepen");
		medicine.list("Ativan");
		medicine.list("Dolo-650");
		medicine.list("Lisinopril");
		medicine.list("Dexamenthose");
		medicine.list("Citrigen");
		medicine.list("Rexodine_M");
		medicine.list("C_Art eye drop");
		medicine.list("Dart");
		
	}

}
