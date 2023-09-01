package com.xworkz.crudOperations.app.repository;

public class ArtistRepositoryImpl implements ArtistRepository{
	
	private String[] tools=new String[TOTAL_ITEMS];
	
	private int position;

	@Override
	public void items(String Tools) {
		System.out.println("Invoking items in ArtistRepository");
		if(position<TOTAL_ITEMS)
		{
			this.tools[position]=Tools;
			System.out.println("The Artist Items are "+Tools + "at the position of "+this.position++);
			this.position++;
		}
		else
		{
			System.out.println("index is full, no need to add the items");
		}
		
	}
	
	

}
