package com.xworkz.dto.boot;

import com.xworkz.dto.app.dto.AadharDTO;
import com.xworkz.dto.app.repository.AadharRepository;
import com.xworkz.dto.app.repository.AadharRepositoryImpl;
import com.xworkz.dto.app.service.AadharService;
import com.xworkz.dto.app.service.AadharServiceImpl;

public class AadharRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in Aadhar Runner");
		
		AadharRepository repository=new AadharRepositoryImpl();
		
		AadharService service= new AadharServiceImpl(repository);
		
		AadharDTO dto=new AadharDTO(222244448888l, "Rachana", "Shivamogga", 8);
		
		boolean persistant=service.validateAndSave(dto);
		System.out.println("Persistant " +persistant);
  }
}
