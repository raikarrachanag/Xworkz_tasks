package practice.app;


	public class RecepiesHotel extends Hotel{
		@Override
		public void roomFacility() {
			System.out.println("Calling SUB class method with no-arg");
		}

		@Override
		public void roomFacility(String hotelName) {
			System.out.println("Calling SUB class method with String-arg");
			System.out.println("Name Of Hotel : " + hotelName);
		}

		@Override
		public void roomFacility(int noOfRooms) {
			System.out.println("Calling SUB class method with int-arg");
			System.out.println("Number OF Room : " + noOfRooms);
		}

		@Override
		public void roomFacility(int noOfRooms, int roomNumber) {
			System.out.println("Calling SUB class method with int,int-arg");
			System.out.println("NO of Rooms : " + noOfRooms);
			System.out.println("Room Number : " + roomNumber);
		}

		@Override
		public void roomFacility(String hotelName, int noOfRooms, int roomNumber) {
			System.out.println("Calling SUB class method with String,int,int-arg");
			System.out.println("Name Of Hotel : " + hotelName);
			System.out.println("NO of Rooms : " + noOfRooms);
			System.out.println("Room Number : " + roomNumber);
		}

		@Override
		public boolean roomFacility(boolean hasFoodFacility) {
			System.out.println("Calling SUB class method with boolean-arg");
			return true;
		}
	}


