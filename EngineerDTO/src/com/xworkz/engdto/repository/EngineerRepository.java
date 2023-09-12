package com.xworkz.engdto.repository;

import com.xworkz.engdto.dto.EngineerDTO;

public interface EngineerRepository {

	int TOTAL_ITEMS=5;
	void save(EngineerDTO dto);
	
	default boolean isExist(EngineerDTO dto)
	{
		return false;
	}
	default EngineerDTO findByName(String name)
	{
		return null;
	}
	default EngineerDTO findByNameAndCollegeName(String name, String collegeName)
	{
		return null;
	}
}
