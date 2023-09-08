package com.xworkz.dto.app.dto;

import java.io.Serializable;

public class NewspaperDTO implements Serializable{
	
	private String pub;
	private String lang;
	private int pages;
	private double cost;
	
    public NewspaperDTO() {
		
	}
	public NewspaperDTO(String pub, String lang, double cost, int pages)
	{
		super();
		this.pub=pub;
		this.lang=lang;
		this.cost=cost;
		this.pages=pages;
	}

	@Override
	public String toString() {
		return "NewspaperDTO [publisher=" + pub + ", lang=" + lang + ", pages=" + pages + ", cost=" + cost + "]";
	}

	public String getPublisher() {
		return pub;
	}

	public void setPublisher(String publisher) {
		this.pub = pub;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}
