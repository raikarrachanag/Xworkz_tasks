package usingInBuiltClasses.app;


	public class SystemClass {

		public static void main(String[] args) {
			String s = System.clearProperty("java.class.path");

			System.setProperty("user.dir", "C:/java.com");

			System.out.println(System.getProperty("user.dir"));

			System.out.print("Current Time in milliseconds = ");
			System.out.println(System.currentTimeMillis());

			System.out.println(System.getProperty("os.name"));

			SecurityManager sm = System.getSecurityManager();
			if (sm == null) {
				System.out.println("The security manager has not created");
			}

			String s1 = "java";
			int ret1 = System.identityHashCode(s1);
			System.out.println(ret1);

		}

	}


