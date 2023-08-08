package overloading.app;

public class BrainEatAmoeba extends Amoeba {
	

		@Override
		public void movement() {
			System.out.println("Calling movement method in Amoeba sub Class");
			super.movement();
		}
	}


