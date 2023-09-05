package com.xworkz.crudOperations.app.service;

import com.xworkz.crudOperations.app.repository.PatientRepository;

public class PatientServiceImpl implements PatientService {

	private PatientRepository patientRepository;

	public PatientServiceImpl(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}

	@Override
	public boolean validateAndSave(String patientName) {
		System.out.println("invoking validateAndSave in PatientServiceImpl");

		if (patientName != null && !patientName.isEmpty() && patientName.length() > 3 && patientName.length() < 20) {
			System.out.println("Data is valid");
			this.patientRepository.saveData(patientName);
		} else {
			System.err.println("Data is invalid");
		}
		return false;
	}


}
