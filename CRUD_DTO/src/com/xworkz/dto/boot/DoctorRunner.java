package com.xworkz.dto.boot;

import com.xworkz.dto.app.dto.DoctorDTO;
import com.xworkz.dto.app.repository.DoctorRepository;
import com.xworkz.dto.app.repository.DoctorRepositoryImpl;
import com.xworkz.dto.app.service.DoctorService;
import com.xworkz.dto.app.service.DoctorServiceImpl;

public class DoctorRunner {

	public static void main(String[] args) {
		
		DoctorRepository repo=new DoctorRepositoryImpl();
		
		DoctorService service=new DoctorServiceImpl(repo);
		
		DoctorDTO dto=new DoctorDTO("RGR", 200000, "Cardiologist", "Shimogga");
		
		boolean persistant=service.validateAndSave(dto);
		System.out.println("persistant "+persistant);
	}
}
