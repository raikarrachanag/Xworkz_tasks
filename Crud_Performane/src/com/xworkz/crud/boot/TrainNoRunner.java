package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.TrainNoRepository;
import com.xworkz.crud.app.repository.TrainNoRepositoryImpl;
import com.xworkz.crud.app.service.TrainNoService;
import com.xworkz.crud.app.service.TrainNoServiceImpl;

public class TrainNoRunner {
	public static void main(String[] args)
	{
		TrainNoRepository trainrepository=new TrainNoRepositoryImpl();
		TrainNoService trainservice=new TrainNoServiceImpl(trainrepository);
		
		boolean saved=trainservice.validateAndSave("Mysore Express");
		System.out.println("saved:" +saved);
		boolean saved1=trainservice.validateAndSave(" ");
		System.out.println("saved:" +saved1);
		boolean saved2=trainservice.validateAndSave(null);
		System.out.println("saved:" +saved2);
		
	}

}
