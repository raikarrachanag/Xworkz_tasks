package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.DoctorDTO;

public interface DoctorService {

	boolean validateAndSave(DoctorDTO dto);
	
}
