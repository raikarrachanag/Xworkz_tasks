package com.xworkz.crud.app.repository;

public interface LocationRepository {

	int TOTAL_ITEMS=10;
	
	void save(String location);
	
	default boolean isExists(String location)
	{
		return false;
	}
}
