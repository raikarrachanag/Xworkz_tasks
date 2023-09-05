package com.xworkz.crud.app.repository;

public class TrainNoRepositoryImpl implements TrainNoRepository {
private String[] train=new String[TOTAL_ITEMS];
	
	private int position=0;
	
	
	@Override
	public void save(String train) {
		System.out.println("Invoking save in TrainRepositoryImpl");
		
		if(this.position<TOTAL_ITEMS)
		{
			this.train[position]=train;
			this.position++;
			System.out.println("The Items are "+train+" at the position of "+position);
		}
		else
		{
			System.err.println("Data Store is Full, not add more data");
		}
		
	}
	@Override
	public boolean isExists(String name)
	{
		for(int index=0; index <=this.position; index++)
		{
			String temp=this.train[index];
			if(temp!=null && temp.equals(name))
			{
				System.out.println("name is already exists");
				return true;
			}
		}
		return false;
	}
	
}


