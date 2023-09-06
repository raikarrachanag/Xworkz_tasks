package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.MobileNoRepository;

public class MobileNoServiceImpl implements MobileNoService{
private MobileNoRepository mobilerepository;
	
	public MobileNoServiceImpl(MobileNoRepository mobilerepository) {
		this.mobilerepository=mobilerepository;
	}
	@Override
	public boolean validateAndSave(long number) {
		System.out.println("invoking validateAndSave in MobileNoServiceImpl");

		if (number >=9000000000L && number<=9999999999L) {
			if(!this.mobilerepository.isExists(number))
			{
				this.mobilerepository.save(number);
				return true;
			}
			else {
				System.out.println("number is already exists, please select another");
			}
	
			System.out.println("number is valid");
			this.mobilerepository.save(number);
			return true;
	}
		 else {
			System.err.println("number is invalid");
		}
		return false;
	}
	
}
