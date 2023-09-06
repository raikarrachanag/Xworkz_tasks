package com.xworkz.crud.app.repository;

public class LocationRepositoryImpl implements LocationRepository {

	private String[] location = new String[TOTAL_ITEMS];

	private int position = 0;

	@Override
	public void save(String location) {
		System.out.println("Invoking save in LocationRepositoryImpl");

		if (this.position < TOTAL_ITEMS) {
			this.location[position] = location;
			this.position++;
			System.out.println("The Items are " + location + " at the position of " + position);
		} else {
			System.err.println("Data Store is Full, not add more data");
		}

	}

	@Override
	public boolean isExists(String location) {
		for (int index = 0; index <= this.position; index++) {
			String temp = this.location[index];
			if (temp != null && temp.equals(location)) {
				System.out.println("name is already exists");
				return true;
			}
		}
		return false;
	}
}
