package com.xworkz.crudOperations.app.repository;

public class GroceryRepositoryImpl implements GroceryRepository {
	private String[] groceries=new String[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(String grocery) {
		System.out.println("Invoking save in GroceryRepositories");
		if(position<TOTAL_ITEMS)
		{
		
		this.groceries[position]=grocery;
		System.out.println("The groceryItem is " + grocery + " in the position "+this.position);
		this.position++;
		
		}
		else {
			System.out.println("The Items are full, not to add more groceries");
		}
	}	
	
}
