package com.xworkz.crudOperations.app.repository;

public class PoliticianRepositoryImpl implements PoliticianRepository{

	private String[] politicians=new String[TOTAL_POLITICIANS];
	
	private int position;

	@Override
	public void names(String politicians) {
		System.out.println("Invoking names in Politicial Repository");
		if(position<TOTAL_POLITICIANS)
		{
			this.politicians[position]=politicians;
			System.out.println("The Politician is "+politicians + " at the position of " +this.position );
			this.position++;
		}
		else
		{
			System.out.println("Index is full, not to add more politician names");
		}
	}
	

	
}
