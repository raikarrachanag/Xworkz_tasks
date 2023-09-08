package com.xworkz.dto.app.dto;

public class PrinterDTO {
 
	private String name;
	private String brand;
	private int warranty;
	private double cost;

public PrinterDTO() {
	
}
public PrinterDTO(String name, String brand, int warranty, double cost)
{
	this.name=name;
	this.brand=brand;
	this.warranty=warranty;
	this.cost=cost;
}
@Override
public String toString() {
	return "PrinterDTO [name=" + name + ", brand=" + brand + ", warranty=" + warranty + ", cost=" + cost + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getWarranty() {
	return warranty;
}
public void setWarranty(int warranty) {
	this.warranty = warranty;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
}