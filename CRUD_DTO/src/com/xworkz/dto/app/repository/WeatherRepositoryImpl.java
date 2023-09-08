package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.WeatherDTO;

public class WeatherRepositoryImpl implements WeatherRepository{

	private WeatherDTO[]  weather=new WeatherDTO[TOTAL_ITEMS];
	
	private int position;

	@Override
	public void save(WeatherDTO weather) {
		System.out.println("Invoking save in WeatherRepository");
		
		if(this.position<TOTAL_ITEMS)
		{
			this. weather[position]= weather;
			this.position++;
			System.out.println("The items are "+ weather +"at the position of "+this.position);
		}
		else
		{
			System.err.println("Data is full, can't add other data");
		}
		
	}
	
	
}
