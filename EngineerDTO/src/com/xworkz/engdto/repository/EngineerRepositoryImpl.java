package com.xworkz.engdto.repository;

import com.xworkz.engdto.dto.EngineerDTO;

public class EngineerRepositoryImpl implements EngineerRepository{

	private EngineerDTO[] dto=new EngineerDTO[TOTAL_ITEMS];
	
	private int position;

	@Override
public void save(EngineerDTO dto) {
	System.out.println("Invoking save in EngineerRepositoryImpl");
	
	if(this.position<TOTAL_ITEMS)
	{
		this.dto[position]=dto;
		System.out.println("The Items are "+dto + "at the position of "+this.position);
		this.position++;
	}
	else
	{
		System.err.println("Data Store is Full, not add more data");
	}
}

	@Override
	public boolean isExist(EngineerDTO dto) {
		for(int index=0; index<position; index++)
		{
			EngineerDTO findByName=this.dto[index];
			if(dto!=null && dto.equals(dto))
			{
				System.err.println("Dto is already exist..");
				return true;
			}
		}
		return EngineerRepository.super.isExist(dto);
	}

	@Override
	public EngineerDTO findByName(String name) {
		for(int index=0; index<position; index++)
		{
			EngineerDTO findByName=this.dto[index];
			if(findByName.getName().equals(name))
			{
				System.out.println("Name is found with dto");
				return findByName;
			}
			else
			{
				System.err.println("No dto matched");
			}
			
		}
		return EngineerRepository.super.findByName(name);
	}

	@Override
	public EngineerDTO findByNameAndCollegeName(String name, String collegeName) {
		for(int index=0; index<position; index++)
		{
			EngineerDTO findByNameAndCollegeName=this.dto[index];
			if(findByNameAndCollegeName.getName().equals(name) && findByNameAndCollegeName.getCollegeName().equals(collegeName))
			{
				System.out.println("Name and DevelopedBy is valid, can save");
				return findByNameAndCollegeName;
			}
			else
			{
				System.err.println("Name and DevelopedBy is invalid, cannot save");
			}
		}
		return EngineerRepository.super.findByNameAndCollegeName(name, collegeName);
	}

}
