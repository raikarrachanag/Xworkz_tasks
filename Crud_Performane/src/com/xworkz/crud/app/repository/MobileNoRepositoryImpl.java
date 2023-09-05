package com.xworkz.crud.app.repository;

public class MobileNoRepositoryImpl implements MobileNoRepository {
private long[] number=new long[TOTAL_ITEMS];
	
	private int position=0;
	
	
	@Override
	public void save(long number) {
		System.out.println("Invoking save in MobileNoRepositoryImpl");
		
		if(this.position<TOTAL_ITEMS)
		{
			this.number[position]=number;
			this.position++;
			System.out.println("The Items are "+number+" at the position of "+position);
		}
		else
		{
			System.err.println("Data Store is Full, not add more data");
		}
		
	}
	@Override
	public boolean isExists(long number)
	{
		for(int index=0; index <=this.position; index++)
		{
			long temp=this.number[index];
			if(temp!=0 && temp==number)
			{
				System.out.println("name is already exists");
				return true;
			}
		}
		return false;
	}
	
}


