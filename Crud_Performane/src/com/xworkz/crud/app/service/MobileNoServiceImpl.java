package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.CountryRepository;
import com.xworkz.crud.app.repository.MobileNoRepository;

public class MobileNoServiceImpl implements MobileNoService{
private MobileNoRepository mobilerepository;
	
	public MobileNoServiceImpl(MobileNoRepository mobilerepository) {
		this.mobilerepository=mobilerepository;
	}
	@Override
	public boolean validateAndSave(long number) {
		System.out.println("invoking validateAndSave in MobileNoServiceImpl");

		if (number != 0 && number > 3 && number < 20) {
			if(!this.mobilerepository.isExists(number))
			{
				this.mobilerepository.save(number);
				return true;
			}
			else {
				System.out.println("number is already exists, please select another");
			}
	
			System.out.println("Data is valid");
			this.mobilerepository.save(number);
			return true;
	}
		 else {
			System.err.println("Data is invalid");
		}
		return false;
	}
	
}
