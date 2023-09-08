package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.PrinterDTO;

public interface PrinterRepository {
	int TOTAL_ITEMS=5;
	 void save(PrinterDTO dto);
}
