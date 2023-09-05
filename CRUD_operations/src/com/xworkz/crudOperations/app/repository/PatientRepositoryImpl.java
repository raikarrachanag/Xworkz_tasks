package com.xworkz.crudOperations.app.repository;

public class PatientRepositoryImpl implements PatientRepository {
	
		String[] names=new String[TOTAL_NAMES];
		int list;
		
		@Override
		public void saveData(String names) {
			System.out.println("invoking care in PatientRepository...");
			if(list<TOTAL_NAMES)
			{
				this.names[list]=names;
				System.out.println("Stored "+names +" in position "+this.list);
				this.list++;
			}
			else
			{
				System.err.println("Stored names is more than total names...");
			}
		}
}
