package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.DoctorDTO;
import com.xworkz.dto.app.repository.DoctorRepository;

public class DoctorServiceImpl implements DoctorService {
	private DoctorRepository repository;
	
	public DoctorServiceImpl(DoctorRepository repository)
	{
		this.repository=repository;
	}

	@Override
	public boolean validateAndSave(DoctorDTO dto) {
		System.out.println("Invoking validateAndSave in DoctorServiceImpl");
		if(dto!=null)
		{
			System.out.println("dto is not null");
			
			String name=dto.getName();
			double salary=dto.getSalary();
			String domain=dto.getDomain();
			String location=dto.getLocation();
			if(name!=null)
			{
				System.out.println("name is valid");
			}
			else
			{
				System.out.println("name is Invalid");
			}
			if(salary>=100000)
			{
				System.out.println("Salary is Valid");
			}
			else
			{
				System.out.println("Salary is Invalid");
			}
			if(domain!=null)
			{
				System.out.println("domain is valid");
			}
			else
			{
				System.out.println("domain is Invalid");
			}
			if(location!=null)
			{
				System.out.println("location is Valid");
			}
			else
			{
				System.out.println("location is Invalid");
			}
			this.repository.save(dto);
			return true;
		}
		else
		{
			System.out.println("Dto is null, can't saved");
		}
		return false;
	}

	
}
