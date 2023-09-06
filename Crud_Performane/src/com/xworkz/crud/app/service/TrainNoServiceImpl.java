package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.TrainNoRepository;

public class TrainNoServiceImpl implements TrainNoService {
private TrainNoRepository trainrepository;
	
	public TrainNoServiceImpl(TrainNoRepository trainrepository) {
		this.trainrepository=trainrepository;
	}
	@Override
	public boolean validateAndSave(String train) {
		System.out.println("invoking validateAndSave in TrainServiceImpl");

		if (train != null && !train.isEmpty() && train.length() > 3 && train.length() < 20) {
			if(!this.trainrepository.isExists(train))
			{
				this.trainrepository.save(train);
				return true;
			}
			else {
				System.out.println("Train is already exists, please select another");
			}
	
			System.out.println("Data is valid");
			this.trainrepository.save(train);
			return true;
	}
		 else {
			System.err.println("Data is invalid");
		}
		return false;
	}
	
}
