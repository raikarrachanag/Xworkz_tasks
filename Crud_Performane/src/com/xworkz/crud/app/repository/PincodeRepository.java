package com.xworkz.crud.app.repository;

public interface PincodeRepository {
int TOTAL_ITEMS=10;
	
	void save(int code);
	
	default boolean isExists(int code)
	{
		return false;
	}
}


