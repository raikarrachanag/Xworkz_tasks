package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.AadharDTO;
import com.xworkz.dto.app.repository.AadharRepository;

public class AadharServiceImpl implements AadharService{

	private AadharRepository repository;
	
	public AadharServiceImpl(AadharRepository repository)
	{
		this.repository=repository;
	}

	@Override
	public boolean validateAndSave(AadharDTO dto) {
		if(dto!=null)
		{
			System.out.println("dto is not null");
			long number=dto.getNumber();
			String name=dto.getName();
			String location=dto.getLocation();
			int id=dto.getId();
			
			if(number>111111111111l && number<=999999999999l)
			{
				System.out.println("Aadhar number is Valid");
			}
			else
			{
				System.out.println("Aadhar number is Invalid!");
			}
			if(name!=null)
			{
				System.out.println("Name is valid");
			}
			else
			{
				System.out.println("Name is Invalid");
			}
			if(location!=null)
			{
				System.out.println("Location is Valid");
			}
			else
			{
				System.out.println("Location is Invalid");
			}
			if(id>=1)
			{
				System.out.println("Id is Valid");
			}
			else
			{
				System.out.println("Id is Invalid");
			}
			
			this.repository.save(dto);
			return true;
			
		}
		else
		{
			System.out.println("dto is null, can't saved");
		}
		return false;
	}
	
	
	
}