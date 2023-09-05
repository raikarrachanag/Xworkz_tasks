package com.xworkz.crudOperations.app.service;

import com.xworkz.crudOperations.app.repository.PilotRepository;

public class PilotServiceImpl implements PilotService {

	private PilotRepository pilotRepository;

	public PilotServiceImpl(PilotRepository pilotRepository) {
		this.pilotRepository = pilotRepository;
	}

	@Override
	public boolean validateAndService(String pilotName) {
		System.out.println("invoking validateAndService in PilotServiceImpl");

		if (pilotName != null && !pilotName.isEmpty() && pilotName.length() > 3 && pilotName.length() < 20) {
			System.out.println("Data is valid");
			this.pilotRepository.saveData(pilotName);
		} else {
			System.err.println("Data is invalid");
		}
		return false;
	}

}
