package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.CountryRepository;
import com.xworkz.crud.app.repository.CountryRepositoryImpl;
import com.xworkz.crud.app.service.CountryService;
import com.xworkz.crud.app.service.CountryServiceImpl;

public class CountryRunner {

	public static void main(String[] args)
	{
		CountryRepository countryrepository=new CountryRepositoryImpl();
		CountryService countryservice=new CountryServiceImpl(countryrepository);
		
		boolean saved=countryservice.validateAndSave("India");
		System.out.println("saved:" +saved);
		boolean saved1=countryservice.validateAndSave(" ");
		System.out.println("saved:" +saved1);
		boolean saved2=countryservice.validateAndSave(null);
		System.out.println("saved:" +saved2);
		
	}
}
