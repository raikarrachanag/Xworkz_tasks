package com.xworkz.crudOperations.app.service;

import com.xworkz.crudOperations.app.repository.ArtistRepository;

public class ArtistServiceImpl implements ArtistService{

	private ArtistRepository artistrepository;
	
	public ArtistServiceImpl(ArtistRepository artistrepository ) {
		this.artistrepository=artistrepository;
		
	}
	@Override
	public boolean validateAndSave(String name) {
		System.out.println("Invoking validateandsave in ArtistService");
		if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<20)
		{
			System.out.println("Data is Valid");
			this.artistrepository.save(name);
		}
		else
		{
			System.out.println("Data is Invalid!!");
		}
		return false;
	}

}
