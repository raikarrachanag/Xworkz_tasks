package com.xworkz.crudOperations.app.service;

import com.xworkz.crudOperations.app.repository.PoliticianRepository;

public class PoliticianServiceImpl implements PoliticianService {

	private PoliticianRepository policiticianRepository;

	public PoliticianServiceImpl(PoliticianRepository policiticianRepository) {
		this.policiticianRepository = policiticianRepository;
	}

	@Override
	public boolean validateAndSave(String politicianName) {
		System.out.println("invoking validateAndSave in PoliticianServiceImpl");

		if (politicianName != null && !politicianName.isEmpty() && politicianName.length() > 3
				&& politicianName.length() < 20) {
			System.out.println("Data is vvalid");
			this.policiticianRepository.saveData(politicianName);
		} else {
			System.err.println("Data is invalid");
		}
		return false;
	}


}
