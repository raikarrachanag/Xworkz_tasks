package com.xworkz.engdto.repository;

import com.xworkz.engdto.dto.ApplicationDTO;

public interface ApplicationRepository {


	int TOTAL_APP=10;
	
	void save(ApplicationDTO dto);
	
	default boolean isExist(ApplicationDTO dto)
	{
		return true;
	}
	
	default ApplicationDTO findByName(String name)
	{
		return null;
	}
	default ApplicationDTO findByNameAndDevelopedBy(String name,String developedBy)
	{
		return null;
	}
}
