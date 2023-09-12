package com.xworkz.engdto.service;

import com.xworkz.engdto.dto.EngineerDTO;

public interface EngineerService {

	boolean validateAndSave(EngineerDTO  dto);
	
	EngineerDTO findByName(String name);
	
	EngineerDTO findByNameAndCollegeName(String name, String collegeName);
}
