package com.xworkz.crudOperations.app.service;

import com.xworkz.crudOperations.app.repository.GroceryRepository;

public class GroceryServiceImpl implements GroceryService{

	private GroceryRepository groceryrepository;
	
	public GroceryServiceImpl(GroceryRepository groceryrepository) {
		this.groceryrepository=groceryrepository;
	}

	@Override
	public boolean validateAndSave(String name) {
		System.out.println("Invoking validateAndSave in GroceryService");
		if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<20)
		{
			System.out.println("Data is Valid");
			this.groceryrepository.save(name);
		}
		else
		{
			System.out.println("Data is Invalid");
		}
		return false;
	}
	
}
