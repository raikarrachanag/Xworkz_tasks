package com.xworkz.engdto.service;

import com.xworkz.engdto.dto.ApplicationDTO;

public interface ApplicationService {


	boolean validateAndSave(ApplicationDTO dto);
	
	ApplicationDTO findByName(String name);
	
	ApplicationDTO findByNameAndDevelopedBy(String name,String developedBy);
}
