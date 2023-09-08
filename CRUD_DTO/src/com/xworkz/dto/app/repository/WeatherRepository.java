package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.WeatherDTO;

public interface WeatherRepository {

	int TOTAL_ITEMS=4;
	void save(WeatherDTO weather);
	
}
