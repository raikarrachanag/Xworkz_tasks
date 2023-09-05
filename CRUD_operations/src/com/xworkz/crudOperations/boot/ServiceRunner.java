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
import com.xworkz.crudOperations.app.service.ArtistService;
import com.xworkz.crudOperations.app.service.ArtistServiceImpl;
import com.xworkz.crudOperations.app.service.GroceryService;
import com.xworkz.crudOperations.app.service.GroceryServiceImpl;
import com.xworkz.crudOperations.app.service.HistoricalPlaceService;
import com.xworkz.crudOperations.app.service.HistoricalPlaceServiceImpl;
import com.xworkz.crudOperations.app.service.JacketService;
import com.xworkz.crudOperations.app.service.JacketServiceImpl;
import com.xworkz.crudOperations.app.service.MedicineService;
import com.xworkz.crudOperations.app.service.MedicineServiceImpl;
import com.xworkz.crudOperations.app.service.PatientService;
import com.xworkz.crudOperations.app.service.PatientServiceImpl;
import com.xworkz.crudOperations.app.service.PilotService;
import com.xworkz.crudOperations.app.service.PilotServiceImpl;
import com.xworkz.crudOperations.app.service.PoliticianService;
import com.xworkz.crudOperations.app.service.PoliticianServiceImpl;

public class ServiceRunner {
	
		public static void main(String[] args) {
			System.out.println("invoking main in ArtistServiceRunner");

			ArtistRepository artistRepository = new ArtistRepositoryImpl();

			ArtistService artistService = new ArtistServiceImpl(artistRepository);
			artistService.validateAndSave("Vishnuvardhan");
			System.out.println("***********************");
			artistService.validateAndSave("");
			System.out.println("***********************");
			artistService.validateAndSave(null);
	

			GroceryRepository groceryRepository = new GroceryRepositoryImpl();

			GroceryService groceryService = new GroceryServiceImpl(groceryRepository);
			groceryService.validateAndSave("");
			System.out.println("************************");
			groceryService.validateAndSave("Onion");
			System.out.println("************************");
			groceryService.validateAndSave(null);
			
			HistoricalPlacesRepository historicalPlacesRepository = new HistoricalPlaceRepositoryImpl();

			HistoricalPlaceService historicalService = new HistoricalPlaceServiceImpl(historicalPlacesRepository);
			historicalService.validateAndSave("Hampi");
			System.out.println("*********************");
			historicalService.validateAndSave(null);
			System.out.println("*********************");
			historicalService.validateAndSave("");
			
			JacketRepository jacketRepository = new JacketRepositoryImpl();

			JacketService jacketService = new JacketServiceImpl(jacketRepository);
			jacketService.validateAndSave("Levi's Jacket");
			System.out.println("***********************");
			jacketService.validateAndSave(null);
			System.out.println("***********************");
			jacketService.validateAndSave("");

			MedicineRepository medicinRepository = new MedicineRepositoryimpl();

			MedicineService medicineService = new MedicineServiceImpl(medicinRepository);
			medicineService.validateAndSave("Paracetamol");
			System.out.println("*************************");
			medicineService.validateAndSave(null);
			System.out.println("*************************");
			medicineService.validateAndSave("");
			
			PatientRepository patientRepository = new PatientRepositoryImpl();

			PatientService patientService = new PatientServiceImpl(patientRepository);
			patientService.validateAndSave("Ravi");
			patientService.validateAndSave(null);
			patientService.validateAndSave("");
			
			PilotRepository pilotRepository = new PilotRepositoryImpl();

			PilotService pilotService = new PilotServiceImpl(pilotRepository);
			pilotService.validateAndService("Abdul Kalam");
			System.out.println("*********************");
			pilotService.validateAndService(null);
			System.out.println("*********************");
			pilotService.validateAndService("");

			PoliticianRepository policiticianRepository = new PoliticianRepositoryImpl();

			PoliticianService politicianService = new PoliticianServiceImpl(policiticianRepository);
			politicianService.validateAndSave("Modi");
			System.out.println("*****************");
			politicianService.validateAndSave(null);
			System.out.println("*****************");
			politicianService.validateAndSave("");
		}
}
