package com.xworkz.dto.app.dto;

public class DoctorDTO {

	private String name;
	private double salary;
	private String domain;
	private String location;


public DoctorDTO() {
	
}
public DoctorDTO(String name, double salary, String domain, String location)
{
	super();
	this.name=name;
	this.salary=salary;
	this.domain=domain;
	this.location=location;
}
@Override
public String toString() {
	return "DoctorDTO [name=" + name + ", salary=" + salary + ", domain=" + domain + ", location=" + location + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
	 
}
