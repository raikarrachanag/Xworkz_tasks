package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.PincodeRepository;
import com.xworkz.crud.app.repository.PincodeRepositoryImpl;
import com.xworkz.crud.app.service.PincodeService;
import com.xworkz.crud.app.service.PincodeServiceImpl;

public class PincodeRunner {
	public static void main(String[] args)
	{
		PincodeRepository pincoderepository=new PincodeRepositoryImpl();
		PincodeService pincodeservice=new PincodeServiceImpl(pincoderepository);
		
		boolean saved=pincodeservice.validateAndSave(577213);
		System.out.println("saved:" +saved);
		
	}
}
