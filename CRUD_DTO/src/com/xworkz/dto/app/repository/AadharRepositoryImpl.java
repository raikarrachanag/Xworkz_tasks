package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.AadharDTO;

public class AadharRepositoryImpl implements AadharRepository {

	private AadharDTO[] dto=new AadharDTO[TOTAL_ITEMS];
	
	private int position;

	@Override
	public void save(AadharDTO dto) {
		System.out.println("Invoking save in AadharRepository");
		if(dto!=null)
		{
			
		this.dto[position]=dto;
		System.out.println("The items are "+dto + "at the position of "+position);
		this.position++;
		}
		else
		{
			System.out.println("Index is full, not add more data");
		}
	}
	
	
	
}
