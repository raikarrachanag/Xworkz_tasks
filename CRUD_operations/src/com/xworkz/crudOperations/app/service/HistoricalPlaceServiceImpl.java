package com.xworkz.crudOperations.app.service;

import com.xworkz.crudOperations.app.repository.HistoricalPlacesRepository;

public class HistoricalPlaceServiceImpl implements HistoricalPlaceService {

	private HistoricalPlacesRepository repository;
	
	public HistoricalPlaceServiceImpl(HistoricalPlacesRepository repository) {
		this.repository=repository;
	}

	@Override
	public boolean validateAndSave(String place) {
		System.out.println("Invoking validateAndSave in HistoricalPlaceService");
		
		if(place!=null && !place.isEmpty() && place.length()>3 && place.length()<20 )
		{
			System.out.println("Data is Valid!");
			this.repository.save(place);
		}
		else
		{
			System.out.println("Data is Invalid!");
		}
		return false;
	}
	
	
}
