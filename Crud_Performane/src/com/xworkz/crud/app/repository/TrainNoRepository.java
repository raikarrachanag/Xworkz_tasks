package com.xworkz.crud.app.repository;

public interface TrainNoRepository {
int TOTAL_ITEMS=10;
	
	void save(String train);
	
	default boolean isExists(String train)
	{
		return false;
	}

}
