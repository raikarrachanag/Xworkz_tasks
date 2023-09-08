package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.DoctorDTO;

public class DoctorRepositoryImpl implements DoctorRepository{

	private DoctorDTO[] dto=new DoctorDTO[TOTAL_ITEMS];
	
	private int position;

	@Override
	public void save(DoctorDTO dto) {
		System.out.println("Invoking save in DoctorRepository");
		if(this.position<TOTAL_ITEMS)
		{
			this.dto[position]=dto;
			System.out.println("the items are "+dto + "at the position of "+this.position);
			this.position++;
			
		}
		else
		{
			System.out.println("The Index is Full, not saved");
		}
		
	}
	
}
