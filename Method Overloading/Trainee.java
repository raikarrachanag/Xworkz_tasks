class Trainee{
	static void trainee(){
		System.out.println("Trainee running with a main");
	}
	
	static void learn(){
		System.out.println("learn Technical Skills");
	}
	
	static void trainee(String name){
		System.out.println("Name of the Trainee: " + name);
	}
	
	static void traineeSalary(double fees){
		System.out.println("Fee Structure: " + fees);
	}
	
	static void traineeName(String name, int duration){
		System.out.println("Name of the Trainee: " + name);
		System.out.println("Course Duration: " + duration);
	}
	
	static void traineeWork(){
		System.out.println("Learn Technical Skills and get placed");
	}
	
	static void employee(){
		System.out.println("Trainee is an basically employee in training");
	}
	
	static void placement(long salary){
		System.out.println("Average placement Salary: " + salary);
	}
	
	static void NoOfCompanyAttended(){
		System.out.println("Many more companies were visited in institute, but she attended few which she likes");
	}
	
	static void necessary(){
		System.out.println("laptop is necessary for software trainee");
	}
	
public static void main(String[] args){
	
	trainee();
	System.out.println("\n");
	
	learn();
	System.out.println("\n");
	
	trainee("Rachana");
	System.out.println("\n");
	
	traineeSalary(24000);
	System.out.println("\n");
	
	traineeName("Rachana", 3);
	System.out.println("\n");
	
	traineeWork();
	System.out.println("\n");
	
	employee();
	System.out.println("\n");
	
	placement(400000);
	System.out.println("\n");
	
	NoOfCompanyAttended();
	System.out.println("\n");
	
	necessary();
	System.out.println("\n");
	
	
}
}
