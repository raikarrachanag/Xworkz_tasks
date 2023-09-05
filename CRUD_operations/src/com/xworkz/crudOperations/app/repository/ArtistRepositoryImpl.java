package com.xworkz.crudOperations.app.repository;

public class ArtistRepositoryImpl implements ArtistRepository{
	

		private String[] artiests = new String[NO_OF_ARTISTS];
		int pos;

		@Override
		public void save(String name) {
			System.out.println("invoking save in ArtistRepositoryImpl");
			if (this.pos < NO_OF_ARTISTS) {
				this.artiests[pos] = name;
				System.out.println(artiests[pos] + " is stored in position " + pos);
				pos++;
			} else {
				System.err.println("Data store is full, can't store more artists");
			}

		}
	
	

}
