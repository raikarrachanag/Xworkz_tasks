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
		jacket.save("Puma");
		jacket.save("Reebok");
		jacket.save("Adidas");
		jacket.save("Allen Solly");
		jacket.save("Levi's");
		jacket.save("Nike");
		jacket.save("Gucci");
		jacket.save("Wow");
		jacket.save("Fila");
		jacket.save("FashionNova");
		System.out.println("\n");
		
		PoliticianRepository politician=new PoliticianRepositoryImpl();
		politician.saveData("Rahul Gandhi");
		politician.saveData("Rajiv Gandhi");
		politician.saveData("Siddaramaiah");
		politician.saveData("Indira Gandhi");
		politician.saveData("DK Shivakumar");
		politician.saveData("B.S Yadiyurappa");
		politician.saveData("G.M Siddeshwar");
		politician.saveData("Mallikarjun Kharge");
		politician.saveData("Prathibha Patil");
		politician.saveData("Manmohan Singh");
		System.out.println("\n");
		
		ArtistRepository artist=new ArtistRepositoryImpl();
		artist.save("Pencil");
		artist.save("Pen");
		artist.save("Color");
		artist.save("Crance");
		artist.save("Water Color");
		artist.save("Shading Pencil");
		artist.save("Scale");
		artist.save("Paper");
		artist.save("Plywood");
		System.out.println("\n");
		
		PilotRepository pilot=new PilotRepositoryImpl();
		pilot.saveData("Neil Armstrong");
		pilot.saveData("Erich Hartmann");
		pilot.saveData("Charles E.Yeager");
		pilot.saveData("Charles A.Lindberg");
		pilot.saveData("Scott Crossfield");
		pilot.saveData("Jimmy Doolittle");
		pilot.saveData("Pappy Boyington");
		pilot.saveData("Noel Wien");
		pilot.saveData("George Beurling");
		pilot.saveData("Adolph Malan");
		pilot.saveData("Buzz Aldrin");
		pilot.saveData("Pancho Barnes");
		System.out.println("\n");
		
		PatientRepository patient=new PatientRepositoryImpl();
		patient.saveData("Patient 1");
		patient.saveData("Patient 2");
		patient.saveData("Patient 3");
		patient.saveData("Patient 4");
		patient.saveData("Patient 5");
		patient.saveData("Patient 6");
		patient.saveData("Patient 7");
		patient.saveData("Patient 8");
		patient.saveData("Patient 9");
		patient.saveData("Patient 10");
		patient.saveData("Patient 11");
		System.out.println("\n");
		
		HistoricalPlacesRepository place=new HistoricalPlaceRepositoryImpl();
		place.save("Mysore");
		place.save("Badami");
		place.save("Aihole");
		place.save("Halebidu");
		place.save("Shimoga");
		place.save("Dandeli");
		place.save("Hampi");
		place.save("Srirangapatna");
		place.save("Banglore");
		place.save("Beluru");
		place.save("Channagiri");
		System.out.println("\n");
		
		MedicineRepository medicine=new MedicineRepositoryimpl();
		medicine.save("Naproxen");
		medicine.save("Paracetomol");
		medicine.save("Diazepen");
		medicine.save("Ativan");
		medicine.save("Dolo-650");
		medicine.save("Lisinopril");
		medicine.save("Dexamenthose");
		medicine.save("Citrigen");
		medicine.save("Rexodine_M");
		medicine.save("C_Art eye drop");
		medicine.save("Dart");
		
	}

}
