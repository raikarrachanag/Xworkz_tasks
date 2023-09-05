package com.xworkz.crud.app.repository;

public interface MobileNoRepository {
int TOTAL_ITEMS=10;
	
	void save(long number);
	
	default boolean isExists(long name)
	{
		return false;
	}
}


