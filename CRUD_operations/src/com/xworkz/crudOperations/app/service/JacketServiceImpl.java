package com.xworkz.crudOperations.app.service;

import com.xworkz.crudOperations.app.repository.JacketRepository;

public class JacketServiceImpl implements JacketService{
	private JacketRepository jacketRepository;

	public JacketServiceImpl(JacketRepository jacketRepository) {
		this.jacketRepository = jacketRepository;
	}

	@Override
	public boolean validateAndSave(String Jacket_name) {
		System.out.println("invoking validateAndSave in JacketServiceImpl");

		if (Jacket_name != null && !Jacket_name.isEmpty() && Jacket_name.length() > 3 && Jacket_name.length() < 20) {
			System.out.println("Data is valid");
			this.jacketRepository.save(Jacket_name);
		} else {
			System.err.println("Data is invalid");
		}
		return false;
}
	
}
