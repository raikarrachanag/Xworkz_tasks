package Method.boot;

import Method.app.Minister;

public class MinisterRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in MinisterRunneer");

		Minister minister = new Minister("Siddu", 78, "Congress", false, "LLB", 20);
		System.out.println(minister);

		Minister minister2 = new Minister("Yadiyur", 80, "BJP", false, "Degree", 20);
		System.out.println(minister2);
		System.out.println("****************************");

		boolean same = minister.equals(minister2);
		System.out.println("contents are same:" + same);

}
}
