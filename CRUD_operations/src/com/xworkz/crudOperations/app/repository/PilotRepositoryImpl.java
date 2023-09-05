package com.xworkz.crudOperations.app.repository;

public class PilotRepositoryImpl implements PilotRepository{
	
	private String[] names=new String[TOTAL_PILOTS];
	private int position;

	@Override
	public void saveData(String names) {
		System.out.println("Invoking save in PilotRepositories");
		if(position<TOTAL_PILOTS)
		{
		
		this.names[position]=names;
		System.out.println("Pilot name is "+names + "at the position of "+this.position);
		this.position++;
		
		}
		else {
			System.out.println("The Items are full, not to add more Pilot names");
		}
	}

}
