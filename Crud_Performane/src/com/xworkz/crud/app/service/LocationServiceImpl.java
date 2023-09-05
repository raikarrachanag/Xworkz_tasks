package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.LocationRepository;

public class LocationServiceImpl implements LocationService{

	private LocationRepository locationrepository;
	
	public LocationServiceImpl(LocationRepository locationrepository) {
		this.locationrepository=locationrepository;
	}
	@Override
	public boolean validateAndSave(String name) {
		System.out.println("invoking validateAndSave in locationServiceImpl");

		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
			if(!this.locationrepository.isExists(name))
			{
				this.locationrepository.save(name);
				return true;
			}
			else {
				System.out.println("name is already exists, please select another");
			}
	
			System.out.println("Data is valid");
			this.locationrepository.save(name);
			return true;
	}
		 else {
			System.err.println("Data is invalid");
		}
		return false;
	}
	
	
	
}

