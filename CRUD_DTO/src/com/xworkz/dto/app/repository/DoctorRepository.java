package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.DoctorDTO;

public interface DoctorRepository {

	int TOTAL_ITEMS=5;
	void save(DoctorDTO dto);
	
}
