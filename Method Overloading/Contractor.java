class Contractor{

 static void contractor()
 {
  System.out.println("Invoking Contractor Method");
 }
 
 static void person()
 {
  System.out.println("Invoking person in Contractor");
 }
 
 static void contractor(String name)
 {
  System.out.println("Name of the contractor:" +name);
 }
 
 static void contractor(int NoOfBuildings)
 {
  System.out.println("No. of Buildings he construct:" +NoOfBuildings);
 }
 
 static void contractor(String name, int experience)
 {
  System.out.println("Name of the Contractor:" +name);
  System.out.println("Experience:" +experience);
 }
 
  static void contractorWork()
 {
  System.out.println("Contractor Construct the Buildings");
 }
 
  static void contractorSupervise()
 {
  System.out.println("Contractor will guide the labours to complete the work");
 }
 
 static void payAmount(int salary)
 {
  System.out.println("Salary to workers:" +salary);
 }
 
 static void plan()
 {
  System.out.println("Invoking plan in person");
 }
 
 static void bid()
 {
  System.out.println("Invoking bid in person");
 }
}