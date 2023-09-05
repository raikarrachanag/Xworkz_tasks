package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.CountryRepository;

public class CountryServiceImpl implements CountryService {

	private CountryRepository countryrepository;
	
	public CountryServiceImpl(CountryRepository countryrepository) {
		this.countryrepository=countryrepository;
	}
	@Override
	public boolean validateAndSave(String name) {
		System.out.println("invoking validateAndSave in CountryServiceImpl");

		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
			if(!this.countryrepository.isExists(name))
			{
				this.countryrepository.save(name);
				return true;
			}
			else {
				System.out.println("name is already exists, please select another");
			}
	
			System.out.println("Data is valid");
			this.countryrepository.save(name);
			return true;
	}
		 else {
			System.err.println("Data is invalid");
		}
		return false;
	}
	
	
	
}
