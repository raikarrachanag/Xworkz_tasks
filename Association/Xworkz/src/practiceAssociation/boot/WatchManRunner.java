package practiceAssociation.boot;

import practiceAssociation.app.Gun;
import practiceAssociation.app.WatchMan;

public class WatchManRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in WatchManRunner");
		
		WatchMan watchman = new WatchMan();
		watchman.secure();
		
		Gun gun=new Gun();
		gun.shoot();
		
		
		
	}
}
