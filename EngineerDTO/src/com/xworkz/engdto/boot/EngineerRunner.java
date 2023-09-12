package com.xworkz.engdto.boot;

import com.xworkz.engdto.dto.EngineerDTO;
import com.xworkz.engdto.repository.EngineerRepository;
import com.xworkz.engdto.repository.EngineerRepositoryImpl;
import com.xworkz.engdto.service.EngineerService;
import com.xworkz.engdto.service.EngineerServiceImpl;

public class EngineerRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in Engineer Runner");
		
		EngineerRepository repository=new EngineerRepositoryImpl();
		
		EngineerService service= new EngineerServiceImpl(repository);
		
		EngineerDTO dto=new EngineerDTO(2, "Rachana", "JNNCE");
		
		boolean persistant=service.validateAndSave(dto);
		System.out.println("Persistant " +persistant);

		EngineerDTO dto1=new EngineerDTO(2, "Rachana", "JNNCE");
		boolean persistant1=service.validateAndSave(dto1);
		
		System.out.println("Persistant " +persistant1);
		
		System.out.println("\n");
		
		service.findByName("Rachana");
		
		service.findByNameAndCollegeName("Rachana", "JNNCE");
		
		
		
	
  }
}
