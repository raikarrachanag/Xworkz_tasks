package usingInBuiltClasses.app;


	public class RunTime {
		public static void main(String[] args) {
			System.out.println("Program is starting...");
			Runtime run = Runtime.getRuntime();

			System.out.println("---------instance method------");

			System.out.println("Hello, hiiii");
			System.out.println("" + Runtime.getRuntime().availableProcessors());

			System.out.println("" + Runtime.getRuntime().freeMemory());

			System.out.println("Program starting...");

			Runtime.getRuntime().halt(0);
			System.out.println("Process is running still.");

			System.out.println("Programmm3 starting...");
			System.out.println("" + Runtime.getRuntime().maxMemory());

			System.out.println("Programmm4 is starting...");
			System.out.println("" + Runtime.getRuntime().totalMemory());
		}
	}


