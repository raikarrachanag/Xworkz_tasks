package com.xworkz.crud.app.repository;

public class CountryRepositoryImpl implements CountryRepository{

	private String[] name=new String[TOTAL_ITEMS];
	
	private int position=0;
	
	
	@Override
	public void save(String name) {
		System.out.println("Invoking save in CountryRepositoryImpl");
		
		if(this.position<TOTAL_ITEMS)
		{
			this.name[position]=name;
			this.position++;
			System.out.println("The Items are "+name+" at the position of "+position);
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
			String temp=this.name[index];
			if(temp!=null && temp.equals(name))
			{
				System.out.println("name is already exists");
				return true;
			}
		}
		return false;
	}
	
}

