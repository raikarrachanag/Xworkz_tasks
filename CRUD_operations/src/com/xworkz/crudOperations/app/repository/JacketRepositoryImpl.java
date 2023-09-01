package com.xworkz.crudOperations.app.repository;

public class JacketRepositoryImpl implements JacketRepository{

	private String[] jackets=new String[TOTAL_JACKETS];
	
	private int position;

	@Override
	public void jackets(String jackets) {
		System.out.println("Invoking jackets in JacketRepository");
		if(position<TOTAL_JACKETS)
		{
			this.jackets[position]=jackets;
			System.out.println("The Jackets is " +jackets + " at the position of " +this.position);
			this.position++;
			
		}
		else
		{
			System.out.println("Index is full, not to add more jackets");
		}
		
	}
}
	
	
