public class Trainer{

 static void teaches()
 {
  System.out.println("Invoking teaches in Trainer");
 }
 
 static void teaches(String name)
 {
  System.out.println("Name of the Trainer:" +name);
 }
 
 static void work(char gender)
 {
  System.out.println("gender of the Trainer:" +gender);
 }
 
 static void work(int experience)
 {
  System.out.println("Experience of the Trainer:" +experience);
 }
 
 static void work(float salary)
 {
  System.out.println("salary of the Trainer:" +salary);
 }
 
  static void work(byte duration)
 {
  System.out.println("Working duration: " +duration);
 }
 
  static void motivateTo(String name)
 {
  System.out.println("Motivate to:" +name);
 }
 
 static void training(int time)
 {
  System.out.println("duration of trainer work:" +time);
 }
 
 static void wakes(String time)
 {
  System.out.println("Trainer wakes at:" +time);
 }
 
 static void trainerPhNo(long PhNo)
 {
  System.out.println("trainer Phone Number:" +PhNo);
 }
 static void emailID(String name)
 {
  System.out.println("Trainer emailId:" +name);
 }
 static void sleep()
 {
  System.out.println("running sleep in Trainer");
 }


 public static void main(String[] args){
	
	teaches();
	System.out.println("\n");
	
	teaches("Sakshi");
	System.out.println("\n");
	
	work('F');
	System.out.println("\n");
	
	work(4);
	System.out.println("\n");
	
	work(40000);
	System.out.println("\n");
	
	work(8);
	System.out.println("\n");
	
	motivateTo("Students");
	System.out.println("\n");
	
	training(4);
	System.out.println("\n");
	
	wakes("6.00 am");
	System.out.println("\n");
	
	trainerPhNo(8431882167l);
	System.out.println("\n");
	
	emailID("sakshi@gmail.com");
	System.out.println("\n");
	
	sleep();
}
}