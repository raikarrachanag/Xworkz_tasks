package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.LocationRepository;
import com.xworkz.crud.app.repository.LocationRepositoryImpl;
import com.xworkz.crud.app.service.LocationService;
import com.xworkz.crud.app.service.LocationServiceImpl;

public class LocationRunner {
	public static void main(String[] args)
	{
		LocationRepository locationrepository=new LocationRepositoryImpl();
		LocationService locationservice=new LocationServiceImpl(locationrepository);
		
		boolean saved=locationservice.validateAndSave("Channagiri");
		System.out.println("saved:" +saved);
		boolean saved1=locationservice.validateAndSave(" ");
		System.out.println("saved:" +saved1);
		boolean saved2=locationservice.validateAndSave(null);
		System.out.println("saved:" +saved2);
		
	}

}
