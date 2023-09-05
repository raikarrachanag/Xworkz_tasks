package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.CountryRepository;
import com.xworkz.crud.app.repository.PincodeRepository;

public class PincodeServiceImpl implements PincodeService{
private PincodeRepository pincoderepository;
	
	public PincodeServiceImpl(PincodeRepository pincoderepository) {
		this.pincoderepository=pincoderepository;
	}
	@Override
	public boolean validateAndSave(int code) {
		System.out.println("invoking validateAndSave in PincodeServiceImpl");

		if (code != 0 && code > 3 && code < 20) {
			if(!this.pincoderepository.isExists(code))
			{
				this.pincoderepository.save(code);
				return true;
			}
			else {
				System.out.println("name is already exists, please select another");
			}
	
			System.out.println("Data is valid");
			this.pincoderepository.save(code);
			return true;
	}
		 else {
			System.err.println("Data is invalid");
		}
		return false;
	}
	
}
