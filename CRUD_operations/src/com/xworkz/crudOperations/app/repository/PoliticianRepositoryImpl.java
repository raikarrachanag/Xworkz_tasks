package com.xworkz.crudOperations.app.repository;

public class PoliticianRepositoryImpl implements PoliticianRepository {

	private String[] politicians = new String[TOTAL_POLITICIANS];
	int pos;

	@Override
	public void saveData(String politician) {
		System.out.println("invoking saveData() in PoliticianRepositoryImpl");

		if (this.pos < TOTAL_POLITICIANS) {
			this.politicians[pos] = politician;
			System.out.println(politicians[pos] + " is stored in position " + pos);
			pos++;
		} else {
			System.err.println("Data store is full, can't store more politicians");
		}

	}

}