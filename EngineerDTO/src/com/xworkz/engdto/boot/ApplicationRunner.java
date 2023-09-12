package com.xworkz.engdto.boot;

import com.xworkz.engdto.dto.ApplicationDTO;
import com.xworkz.engdto.repository.ApplicationRepository;
import com.xworkz.engdto.repository.ApplicationRepositoryImpl;
import com.xworkz.engdto.service.ApplicationService;
import com.xworkz.engdto.service.ApplicationServiceImpl;

public class ApplicationRunner {


	public static void main(String[] args) {
		
		ApplicationRepository applicationRepository=new ApplicationRepositoryImpl();
		
		ApplicationService applicationService=new ApplicationServiceImpl(applicationRepository);
		
		ApplicationDTO dto=new ApplicationDTO(2,"Rachana","Java","Trainiing","Java 1.8");
		
		System.out.println("\n");
		applicationService.validateAndSave(dto);
		
		ApplicationDTO dto1=new ApplicationDTO(2,"Rachana","Java","Trainiing","Java 1.8");
		
		System.out.println("\n");
		applicationService.validateAndSave(dto1);
		
		System.out.println("\n");
		applicationService.findByName("Rachana");
		
		System.out.println("\n");
		applicationService.findByNameAndDevelopedBy("Rachnaa","Java");
		
		
	}
}
