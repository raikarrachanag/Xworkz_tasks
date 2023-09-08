package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.PrinterDTO;

public interface PrinterService {

	boolean validateAndSave(PrinterDTO dto);
}
