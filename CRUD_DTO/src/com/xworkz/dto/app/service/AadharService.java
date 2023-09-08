package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.AadharDTO;

public interface AadharService {

	boolean validateAndSave(AadharDTO dto);
}
