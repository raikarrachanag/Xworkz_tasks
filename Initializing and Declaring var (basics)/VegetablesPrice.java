class VegetablesPrice{

public static void main(String[] args)
{
 System.out.println("Running main in Vegetables Names....");
 
 float carrot=70;
 float beetroot=60;
 float cucumber= 60;
 float tomato= 100;
 float potato=50;
 float brinjal= 40;
 float chilli= 120;
 
 float[] VegetablesPrice={carrot, beetroot, cucumber, tomato, potato, brinjal, chilli};
  
  int total= VegetablesPrice.length;
  
  System.out.println("\n");
  
  System.out.println("Total Number of VegetablesPrice are:" +total);
  System.out.println("\n");
  
  for(int position=0;position<VegetablesPrice.length; position++)
  {
	  float ref=VegetablesPrice[position];
	  System.out.println("The Vegetables Price is " +ref + " at the position of " +position );
  }
  System.out.println("\n");
  System.out.println("Item at postion 1, before change is " +VegetablesPrice[1]);
  VegetablesPrice[1]= 100;
	
  System.out.println("Item at postion 1, After change is " +VegetablesPrice[1]);
  System.out.println("\n");
  
  System.out.println("Item at postion 6, before change is " +VegetablesPrice[6]);
  VegetablesPrice[6]= 90;
  System.out.println("Item at postion 6, After change is " +VegetablesPrice[6]);
  System.out.println("\n");
 
  for(int position=VegetablesPrice.length-1;position>=0; position--)
  {
	  float ref=VegetablesPrice[position];
	  System.out.println("The Vegetables Price is " +ref + " at the position of " +position );
  }
  
  }}
 

 