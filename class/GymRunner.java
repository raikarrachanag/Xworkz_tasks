class GymRunner{

public static void main(String[] args)
{
 System.out.println("Invoking main in GymRunner");
 
 Gym gym=new Gym();
 System.out.println(gym.noOfPeople);
 System.out.println(gym.location);
 System.out.println(gym.fees);
 System.out.println(gym.duration);
 System.out.println(gym.trainerName);
 System.out.println("=============================================================================================================");
 
 int noOfPeople=50;
 String location="BTM layout";
 float fees=5000;
 int duration=2;
 String trainerName="Bhima";
 
 System.out.println("Print after Re-initializing");
 
 Gym gym1=new Gym();
 System.out.println(noOfPeople);
 System.out.println(location);
 System.out.println(fees);
 System.out.println(duration);
 System.out.println(trainerName);
 
 
 }}