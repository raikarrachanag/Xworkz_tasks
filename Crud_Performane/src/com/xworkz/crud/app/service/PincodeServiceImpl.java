package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.PincodeRepository;

public class PincodeServiceImpl implements PincodeService{
private PincodeRepository pincoderepository;
	
	public PincodeServiceImpl(PincodeRepository pincoderepository) {
		this.pincoderepository=pincoderepository;
	}
	@Override
	public boolean validateAndSave(int code) {
		System.out.println("invoking validateAndSave in PincodeServiceImpl");

		if (code <=500000 && code>=700000) {
			if(!this.pincoderepository.isExists(code))
			{
				this.pincoderepository.save(code);
				return true;
			}
			else {
				System.out.println("pincode is already exists, please select another");
			}
	
			System.out.println("code is valid");
			this.pincoderepository.save(code);
			return true;
	}
		 else {
			System.err.println("code is invalid");
		}
		return false;
	}
	
}
