package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.MobileNoRepository;
import com.xworkz.crud.app.repository.MobileNoRepositoryImpl;
import com.xworkz.crud.app.service.MobileNoService;
import com.xworkz.crud.app.service.MobileNoServiceImpl;

public class MobileNoRunner {

	public static void main(String[] args)
	{
		MobileNoRepository mobilerepository=new MobileNoRepositoryImpl();
		MobileNoService mobileservice=new MobileNoServiceImpl(mobilerepository);
		
		boolean saved=mobileservice.validateAndSave(843188216);
		System.out.println("saved:" +saved);
		
	}

}
