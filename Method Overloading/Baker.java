class Baker{

 static void cooking(String foodItem, int noOfPeople, String workingFor, String experience, float duration, String assistance)
 {
  System.out.println("Invoking cooking in Baker");
  System.out.println("\n");
  
  System.out.println("Name Of Food Item:" +foodItem);
  System.out.println("Number of People:" +noOfPeople);
  System.out.println("Working for:" +workingFor);
  System.out.println("Experience:" +experience);
  System.out.println("Time taken to prepare dish:" +duration);
  System.out.println("Assistance:" +assistance);
  System.out.println("\n");
  
  if(foodItem!= null)
 {
   System.out.println("Food Item is Valid");
 }
 else
 {
   System.err.println("Food Item is InValid");
   return;
 }
 
 if(noOfPeople>10)
 {
   System.out.println("Number of people are Valid");
   return;
 }
 else
 {
   System.err.println("Number of people are InValid");
 }
 
 if(workingFor!= null)
 {
   System.out.println("Working for is Valid");
 }
 else
 {
   System.err.println("Woring for is InValid");
   return;
 }
 
 if(experience!=null)
 {
   System.out.println("Experience is Valid");

 }
 else
 {
   System.err.println("Experience is InValid"); 
   return;   
 }
 
 if(duration>2)
 {
   System.out.println("duration is Valid");
   return;
 }
 else
 {
   System.err.println("duration is InValid");
 }
 
 if(assistance!=null)
 {
   System.out.println("assistance is Valid");
 }
 else
 {
   System.err.println("assistance is InValid");
   return;
 }
 
 }
}
 