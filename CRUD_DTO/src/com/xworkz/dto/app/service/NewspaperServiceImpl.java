package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.NewspaperDTO;
import com.xworkz.dto.app.repository.NewspaperRepository;

public class NewspaperServiceImpl implements NewspaperService{
	
	private NewspaperRepository repo;
	
	public NewspaperServiceImpl(NewspaperRepository repo) {
	this.repo=repo;
	}
	@Override
	public boolean validateAndSave(NewspaperDTO dto) {
		System.out.println("Invoking validateAndSave in NewspaperServiceImpl");
		if(dto!=null)
		{
			
			System.out.println("Dto is valid!");
			String pub=dto.getPublisher();
			String lang=dto.getLang();
			double cost=dto.getCost();
			int pages=dto.getPages();
			if(pub!=null && !pub.isEmpty() && pub.length()>=3 && pub.length()<=20)
			{
				System.out.println("Pub is valid!");
			}
			else
			{
				System.err.println("Pub is Invalid!");
				return false;
			}
			if(lang!=null && !lang.isEmpty() && lang.length()>=3 && lang.length()<=20)
			{
				System.out.println("Language is valid!");
			}
			else
			{
				System.err.println("Language is Invalid!");
			}
			if(cost>=2 && pages>=10)
			{
				System.out.println("Cost and pages are Valid!");
			}
			else
			{
				System.err.println("Cost and Pages are Invalid!");
			}
			this.repo.save(dto);
			
			return true;
		}
		else
		{
			System.err.println("Data is Invalid");
		}
		return false;
	}
	
}
