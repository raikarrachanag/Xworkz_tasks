package com.xworkz.dto.app.dto;

import java.io.Serializable;

public class AadharDTO implements Serializable{
	private long number;
	private String name;
	private String location;
	private int id;
	
	public AadharDTO() {
		
	}
	public AadharDTO(long number, String name, String location, int id)
	{
		super();
		this.number=number;
		this.name=name;
		this.location=location;
		this.id=id;
		
	}

	@Override
	public String toString() {
		return "AadharDTO [number=" + number + ", name=" + name + ", location=" + location + ", id=" + id + "]";
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
