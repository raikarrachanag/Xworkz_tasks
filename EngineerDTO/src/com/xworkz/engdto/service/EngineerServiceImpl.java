package com.xworkz.engdto.service;

import com.xworkz.engdto.dto.EngineerDTO;
import com.xworkz.engdto.repository.EngineerRepository;

public class EngineerServiceImpl implements EngineerService{

	private EngineerRepository repository;
	
	public EngineerServiceImpl(EngineerRepository repository) {
		this.repository=repository;
	}
	
	@Override
	public boolean validateAndSave(EngineerDTO dto) {
		System.out.println("Invoking validateAndSave in EngineerServiceImpl");
		if(dto!=null)
		{
			System.out.println("dto is not null");
			int id=dto.getId();
			String name=dto.getName();
			String collegeName=dto.getCollegeName();
			if(id>=1 && id<=50)
			{
				System.out.println("Id is Valid");
			}
			else
			{
				System.out.println("Id is not valid");
			}
			if(name!=null)
			{
				System.out.println("name is valid!");
			}
			else
			{
				System.out.println("name is Invalid!");
			}
			if(collegeName!=null)
			{
				System.out.println("collegeName is Valid");
			}
			else
			{
				System.out.println("CollegeName is Invalid");
				return false;
			}
			if(this.repository.isExist(dto))
			{
			this.repository.save(dto);
			return true;
			}
		}
		else
		{
			System.err.println("dto is Null, cannot save");
			
		}
		return false;
	}

	@Override
	public EngineerDTO findByName(String name) {
		System.out.println("Running findByName in "+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20)
		{
			EngineerDTO findByName=this.repository.findByName(name);
			System.out.println("Name is valid, will find "+findByName);
			return findByName;
		}
		return null;
	}

	@Override
	public EngineerDTO findByNameAndCollegeName(String name, String collegeName) {
		System.out.println("Running findByNameAndCollgeName in "+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20 && collegeName!=null && !collegeName.isEmpty()
			&&	collegeName.length()>=3 && collegeName.length()<=20)
		{
			EngineerDTO findByNameAndCollegeName=this.repository.findByNameAndCollegeName(name, collegeName);
			System.out.println("Name and collegeName is valid,will find "+findByNameAndCollegeName);
			return findByNameAndCollegeName;
		}
		return null;
	}
	
}



	
			
			