package com.xworkz.dto.boot;

import com.xworkz.dto.app.dto.WeatherDTO;
import com.xworkz.dto.app.repository.WeatherRepository;
import com.xworkz.dto.app.repository.WeatherRepositoryImpl;
import com.xworkz.dto.app.service.WeatherService;
import com.xworkz.dto.app.service.WeatherServiceImpl;


public class WeatherRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Weather Runner");
		
		WeatherRepository repository=new WeatherRepositoryImpl();
		
		WeatherService service=new WeatherServiceImpl(repository);
		
		WeatherDTO dto=new WeatherDTO(34, "summer", "Channagiri", "Arecanut");
		
		boolean persistant=service.validateAndSave(dto);
		System.out.println("Persistant " +persistant);
	}
}
