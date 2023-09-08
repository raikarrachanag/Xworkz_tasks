package com.xworkz.dto.app.dto;

import java.io.Serializable;

public class WeatherDTO implements Serializable {
	private int temp;
	private String season;
	private String location;
	private String bestCropToGrow;
	
	public WeatherDTO() {
		
	}
	public WeatherDTO(int temp, String season, String location, String bestCropToGrow)
	{
		super();
		this.temp=temp;
		this.season=season;
		this.location=location;
		this.bestCropToGrow=bestCropToGrow;
	}

	@Override
	public String toString() {
		return "WeatherDTO [temp=" + temp + ", season=" + season + ", location=" + location + ", bestCropToGrow="
				+ bestCropToGrow + "]";
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBestCropToGrow() {
		return bestCropToGrow;
	}

	public void setBestCropToGrow(String bestCropToGrow) {
		this.bestCropToGrow = bestCropToGrow;
	}

}
