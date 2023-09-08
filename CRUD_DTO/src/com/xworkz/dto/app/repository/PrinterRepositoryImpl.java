package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.PrinterDTO;

public class PrinterRepositoryImpl implements PrinterRepository {

	private PrinterDTO[] dto=new PrinterDTO[TOTAL_ITEMS];
	
	private int position;

	@Override
	public void save(PrinterDTO dto) {
		System.out.println("Invoking save in PrinterRepositoryImpl");
		if(this.position<=TOTAL_ITEMS)
		{
			this.dto[position]=dto;
			System.out.println("The items are "+dto + "at the position of "+this.position);
			this.position++;
		}
		else
		{
			System.out.println("The Index is Full, not to save more");
		}
	}
}
