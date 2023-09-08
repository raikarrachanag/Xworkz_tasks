package com.xworkz.dto.boot;

import com.xworkz.dto.app.dto.NewspaperDTO;
import com.xworkz.dto.app.repository.NewspaperRepository;
import com.xworkz.dto.app.repository.NewspaperRepositoryImpl;
import com.xworkz.dto.app.service.NewspaperService;
import com.xworkz.dto.app.service.NewspaperServiceImpl;

public class NewspaperRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main method in NewspaperRunner");
		
		NewspaperRepository repo=new NewspaperRepositoryImpl();
		
		NewspaperService service=new NewspaperServiceImpl(repo);
		
		NewspaperDTO dto=new NewspaperDTO("Deccan Herald", "English", 5, 20);
		
		boolean persistant=service.validateAndSave(dto);
		System.out.println("persisted " +persistant);
	  
	}
}
