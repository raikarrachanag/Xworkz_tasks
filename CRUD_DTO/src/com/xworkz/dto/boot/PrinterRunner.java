package com.xworkz.dto.boot;

import com.xworkz.dto.app.dto.PrinterDTO;
import com.xworkz.dto.app.repository.PrinterRepository;
import com.xworkz.dto.app.repository.PrinterRepositoryImpl;
import com.xworkz.dto.app.service.PrinterService;
import com.xworkz.dto.app.service.PrinterServiceImpl;

public class PrinterRunner {

	public static void main(String[] args) {
		
		PrinterRepository repository=new PrinterRepositoryImpl();
		PrinterService service=new PrinterServiceImpl(repository);
		PrinterDTO dto=new PrinterDTO("HP Printer 2805", "HP",2, 12000);
		
		boolean persistant=service.validateAndSave(dto);
		System.out.println("Persistant "+persistant);
	}
}
