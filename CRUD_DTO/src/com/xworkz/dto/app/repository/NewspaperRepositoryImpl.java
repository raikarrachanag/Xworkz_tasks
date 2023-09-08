package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.NewspaperDTO;

public class NewspaperRepositoryImpl implements NewspaperRepository{

	private NewspaperDTO[] dtos=new NewspaperDTO[TOTAL_ITEMS];
	
	private int position;

	@Override
	public void save(NewspaperDTO dto) {
		System.out.println("Invoking save in NewspaperRepositoryImpl");
		
		if(this.position<TOTAL_ITEMS)
		{
			this.dtos[position]=dto;
			System.out.println("The Items are "+dto+" at the position of "+this.position);
			this.position++;
		}
		else
		{
			System.err.println("Data Store is Full, not add more data");
		}
		
	}
		
	}

