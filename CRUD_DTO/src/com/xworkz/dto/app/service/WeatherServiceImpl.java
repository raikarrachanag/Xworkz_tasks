package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.WeatherDTO;
import com.xworkz.dto.app.repository.WeatherRepository;

public class WeatherServiceImpl implements WeatherService {

	private WeatherRepository repository;
	
	public WeatherServiceImpl(WeatherRepository repository) {
		this.repository=repository;
	}
	
	
	@Override
	public boolean validateAndSave(WeatherDTO weather) {
		System.out.println("Invoking validateAndSave in WeatherServiceImpl");
		if(weather!=null)
		{
			System.out.println("weather is not null");
			int temp=weather.getTemp();
			String season=weather.getSeason();
			String location=weather.getLocation();
			String bestCropToGrow=weather.getBestCropToGrow();
			if(temp>=1 && temp<=50)
			{
				System.out.println("Temperature is valid");
			}
			else
			{
				System.out.println("Temperature is Invalid");
			}
			if(season!=null)
			{
				System.out.println("Season is Valid");
			}
			else
			{
				System.out.println("Season is Invalid");
			}
			if(location!=null)
			{
				System.out.println("Location is Valid");
			}
			else
			{
				System.out.println("Location is Invalid");
			}
			if(bestCropToGrow!=null)
			{
				System.out.println("Crop is Valid");
			}
			else
			{
				System.out.println("Crop is Invalid");
			}
			this.repository.save(weather);
			return true;
		}
		else
		{
			System.err.println("Weather is Null");
		}
		return false;
	}


		
}

