package com.xworkz.crud.app.repository;

public class PincodeRepositoryImpl implements PincodeRepository {
private int[] code=new int[TOTAL_ITEMS];
	
	private int position=0;
	
	
	@Override
	public void save(int code) {
		System.out.println("Invoking save in PincodeRepositoryImpl");
		
		if(this.position<TOTAL_ITEMS)
		{
			this.code[position]=code;
			this.position++;
			System.out.println("Invoking items in save");
		}
		else
		{
			System.err.println("Data Store is Full, not add more data");
		}
		
	}
	@Override
	public boolean isExists(int code)
	{
		for(int index=0; index <=this.position; index++)
		{
			int temp=this.code[index];
			if(temp!=0 && temp==code)
			{
				System.out.println("Pincode is already exists");
				return true;
			}
		}
		return false;
	}
	
}



