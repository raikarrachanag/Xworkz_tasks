package com.xworkz.engdto.dto;

import java.io.Serializable;

public class EngineerDTO implements Serializable {

	private int id;
	private String name;
	private String collegeName;
	
public EngineerDTO()
{
	
}
public EngineerDTO(int id, String name, String collegeName)
{
	super();
	this.id=id;
	this.name=name;
	this.collegeName=collegeName;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
@Override
public String toString() {
	return "EngineerDTO [id=" + id + ", name=" + name + ", collegeName=" + collegeName + "]";
}

@Override
public boolean equals(Object obj) {
	System.out.println("Running equals in EngineerDTO");
	if(obj!=null)
	{
		if(obj instanceof EngineerDTO)
		{
			EngineerDTO dto=(EngineerDTO)obj;
			if(dto.name.equals(obj) && this.getCollegeName().equals(obj) && this.getId()==id)
			{
				System.out.println("instance are same "+dto);
				return true;
			}
			else
			{
				System.err.println("null");
			}
		}
	}
	return super.equals(obj);
}
}


