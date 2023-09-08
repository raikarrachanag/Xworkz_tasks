package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.PrinterDTO;
import com.xworkz.dto.app.repository.PrinterRepository;

public class PrinterServiceImpl implements PrinterService {

	private PrinterRepository repository;
	
	public PrinterServiceImpl(PrinterRepository repository)
	{
		this.repository=repository;
	}

	@Override
	public boolean validateAndSave(PrinterDTO dto) {
		System.out.println("Invoking validateAndSave in PrinterRepository");
		if(dto!=null)
		{
			System.out.println("dto is not null");
			
			String name=dto.getName();
			String brand=dto.getBrand();
			int warranty=dto.getWarranty();
			double cost=dto.getCost();
			if(name!=null)
			{
				System.out.println("name is valid");
			}
			else
			{
				System.err.println("name is Invalid");
			}
			if(brand!=null)
			{
				System.out.println("brand is valid");
			}
			else
			{
				System.err.println("brand is Invalid");
			}
			if(warranty>=1)
			{
				System.out.println("warranty is valid");
			}
			else
			{
				System.out.println("warranty is Invalid");
			}
			if(cost>=5000 && cost<=20000)
			{
				System.out.println("Cost is Valid");
			}
			else
			{
				System.out.println("Cost is Invalid");
			}
			this.repository.save(dto);
			return true;
		}
		else
		{
			System.out.println("Dto is null, not saved");
		}
		return false;
	}
	
}
