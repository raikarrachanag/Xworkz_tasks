class Camera{

 static void click(String location, String date, int howManyPeople, long resolution, String clarity, String cameraMan)
 {
  System.out.println("Invoking click from Camera");
  
  System.out.println("\n");
  System.out.println("Location where photo is captured:" +location);
  System.out.println("date when photo is clicked:" +date);
  System.out.println("Total Number Of People in Photo:" +howManyPeople);
  System.out.println("Resolution of Photo:" +resolution);
  System.out.println("Clarity Of photo:" +clarity);
  System.out.println("Name of Camera Man :" +cameraMan);
  System.out.println("\n");
  
  if(location!=null)
  {
	  System.out.println("The Location is Valid");
  }
  else
  {
	  System.err.println("The Location is Invalid");
	  return;
  }
  
  if(date!=null)
  {
	  System.out.println("The Date is Valid");
  }
  else
  {
	  System.err.println("The Date is Invalid");
	  return;
  }
  
  if(howManyPeople>0)
  {
	  System.out.println("Valid");
  }
  else
  {
	  System.err.println("Invalid");
	  return;
  }
  
  if(resolution>2500)
  {
	  System.out.println("The resolution is Valid");
	  return;
  }
  else
  {
	  System.err.println("The resolution is Invalid");
	 
  }
  
  if(clarity!=null)
  {
	  System.out.println("The clarity is Valid");
  }
  else
  {
	  System.err.println("The clarity is Invalid");
	  return;
  }
  
  if(cameraMan!=null)
  {
	  System.out.println("Valid");
  }
  else
  {
	  System.err.println("Invalid");
	  return;
  }
  
  }}