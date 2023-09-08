package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.AadharDTO;

public interface AadharRepository {
	int TOTAL_ITEMS=5;
	void save(AadharDTO dto);
}
