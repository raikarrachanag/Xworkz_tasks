package com.xworkz.crud.app.repository;

public interface CountryRepository {
    
	int TOTAL_ITEMS=10;
	
	void save(String name);
	
	default boolean isExists(String name)
	{
		return false;
	}
}
