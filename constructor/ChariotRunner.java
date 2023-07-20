class ChariotRunner{

 public static void main(String[] args)
 {
  Chariot chariot = new Chariot();
  System.out.println(chariot.noOfHorse);
  System.out.println(chariot.noOfWheels);
  System.out.println(chariot.fast);
  System.out.println(chariot.horseBreed);
  System.out.println(chariot.horseColor);
  System.out.println(chariot.pricePerkm);
  System.out.println(chariot.horseOriginInState);
  System.out.println(chariot.horseWeight);
  System.out.println(chariot.maxCapacityOfhorse);
  System.out.println(chariot.noKMPerDay);
  System.out.println(chariot.strong);
  System.out.println("===========================================");
  
  Chariot chariot1 = new Chariot(2);
  System.out.println(chariot1.noOfHorse);
  System.out.println("===========================================");
  
  Chariot chariot2 = new Chariot(2, 2);
  System.out.println(chariot2.noOfHorse);
  System.out.println(chariot2.noOfWheels);
  System.out.println("===========================================");
  
  Chariot chariot3 = new Chariot(2, 2, true);
  System.out.println(chariot3.noOfHorse);
  System.out.println(chariot3.noOfWheels);
  System.out.println(chariot3.fast);
  System.out.println("===========================================");
  
  Chariot chariot4 = new Chariot(2, 2, true, "Arabian Horse");
  System.out.println(chariot4.noOfHorse);
  System.out.println(chariot4.noOfWheels);
  System.out.println(chariot4.fast);
  System.out.println(chariot4.horseBreed);
  System.out.println("===========================================");
  
  Chariot chariot5 = new Chariot(2, 2, true, "Arabian Horse", "White");
  System.out.println(chariot5.noOfHorse);
  System.out.println(chariot5.noOfWheels);
  System.out.println(chariot5.fast);
  System.out.println(chariot5.horseBreed);
  System.out.println(chariot5.horseColor);
  System.out.println("===========================================");
  
  Chariot chariot6 = new Chariot(2, 2, true, "Arabian Horse", "White",20);
  System.out.println(chariot6.noOfHorse);
  System.out.println(chariot6.noOfWheels);
  System.out.println(chariot6.fast);
  System.out.println(chariot6.horseBreed);
  System.out.println(chariot6.horseColor);
  System.out.println(chariot6.pricePerkm);
  System.out.println("===========================================");
  
  Chariot chariot7 = new Chariot(2, 2, true, "Arabian Horse", "White", 20, "Manipur");
  System.out.println(chariot7.noOfHorse);
  System.out.println(chariot7.noOfWheels);
  System.out.println(chariot7.fast);
  System.out.println(chariot7.horseBreed);
  System.out.println(chariot7.horseColor);
  System.out.println(chariot7.pricePerkm);
  System.out.println(chariot7.horseOriginInState);
  System.out.println("===========================================");
  
  Chariot chariot8 = new Chariot(2, 2, true, "Arabian Horse", "White",20, "Manipur", 400);
  System.out.println(chariot8.noOfHorse);
  System.out.println(chariot8.noOfWheels);
  System.out.println(chariot8.fast);
  System.out.println(chariot8.horseBreed);
  System.out.println(chariot8.horseColor);
  System.out.println(chariot8.pricePerkm);
  System.out.println(chariot8.horseOriginInState);
  System.out.println(chariot8.horseWeight);
  System.out.println("===========================================");
  
  Chariot chariot9= new Chariot(2, 2, true, "Arabian Horse", "White",20, "Manipur",400,  8);
  System.out.println(chariot9.noOfHorse);
  System.out.println(chariot9.noOfWheels);
  System.out.println(chariot9.fast);
  System.out.println(chariot9.horseBreed);
  System.out.println(chariot9.horseColor);
  System.out.println(chariot9.pricePerkm);
  System.out.println(chariot9.horseOriginInState);
  System.out.println(chariot9.horseWeight);
  System.out.println(chariot9.maxCapacityOfhorse);
  System.out.println("===========================================");
  
  Chariot chariot10= new Chariot(2, 2, true, "Arabian Horse", "White",20, "Manipur", 400, 8, 88);
  System.out.println(chariot10.noOfHorse);
  System.out.println(chariot10.noOfWheels);
  System.out.println(chariot10.fast);
  System.out.println(chariot10.horseBreed);
  System.out.println(chariot10.horseColor);
  System.out.println(chariot10.pricePerkm);
  System.out.println(chariot10.horseOriginInState);
  System.out.println(chariot10.horseWeight);
  System.out.println(chariot10.maxCapacityOfhorse);
  System.out.println(chariot10.noKMPerDay);
  System.out.println("===========================================");
  
  Chariot chariot11= new Chariot(2, 2, true, "Arabian Horse", "White",20, "Manipur", 400, 8, 88, false);
  System.out.println(chariot11.noOfHorse);
  System.out.println(chariot11.noOfWheels);
  System.out.println(chariot11.fast);
  System.out.println(chariot11.horseBreed);
  System.out.println(chariot11.horseColor);
  System.out.println(chariot11.pricePerkm);
  System.out.println(chariot11.horseOriginInState);
  System.out.println(chariot11.horseWeight);
  System.out.println(chariot11.maxCapacityOfhorse);
  System.out.println(chariot11.noKMPerDay);
  System.out.println(chariot11.strong);
  
  }}