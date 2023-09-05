package com.xworkz.crudOperations.app.service;

import com.xworkz.crudOperations.app.repository.MedicineRepository;

public class MedicineServiceImpl implements MedicineService {

	private MedicineRepository medicinRepository;

	public MedicineServiceImpl(MedicineRepository medicinRepository) {
		this.medicinRepository = medicinRepository;
	}

	@Override
	public boolean validateAndSave(String medicineName) {
		System.out.println("invoking validateAndSave in MedicineServiceRunner");

		if (medicineName != null && !medicineName.isEmpty() && medicineName.length() > 3
				&& medicineName.length() < 20) {
			System.out.println("Data is valid");
			this.medicinRepository.save(medicineName);
		} else {
			System.err.println("Data is invalid");
		}
		return false;
	}


}
