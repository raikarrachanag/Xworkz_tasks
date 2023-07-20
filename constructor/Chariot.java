class Chariot{

 int noOfHorse;
 int noOfWheels;
 boolean fast;
 String horseBreed;
 String horseColor;
 float pricePerkm;
 String horseOriginInState;
 int horseWeight;
 long maxCapacityOfhorse;
 long noKMPerDay;
 boolean strong;
 
 Chariot()
 {
  System.out.println("Invoking const in Chariot");
 }
 
 Chariot(int noOfHorse)
 {
 System.out.println("Invoking const in Chariot");
 System.out.println("No Of Horses: " +noOfHorse);
 this.noOfHorse=noOfHorse;
 }
 
 Chariot(int noOfHorse, int noOfWheels)
 {
 System.out.println("Invoking const in Chariot");
 System.out.println("No Of Horses: " +noOfHorse);
 System.out.println("No Of Wheels: " +noOfWheels);
 this.noOfHorse=noOfHorse;
 this.noOfWheels=noOfWheels;
 }
 
 Chariot(int noOfHorse, int noOfWheels, Boolean fast)
 {
 System.out.println("Invoking const in Chariot");
 System.out.println("No Of Horses: " +noOfHorse);
 System.out.println("No Of Wheels: " +noOfWheels);
 System.out.println("Is Chariot is Fast: " +fast);
 this.noOfHorse=noOfHorse;
 this.noOfWheels=noOfWheels;
 this.fast=fast;
 }
  
 Chariot(int noOfHorse, int noOfWheels, Boolean fast, String horseBreed)
 {
 System.out.println("Invoking const in Chariot");
 System.out.println("No Of Horses: " +noOfHorse);
 System.out.println("No Of Wheels: " +noOfWheels);
 System.out.println("Is Chariot is Fast: " +fast);
 System.out.println("Horse Breed: " +horseBreed);
 this.noOfHorse=noOfHorse;
 this.noOfWheels=noOfWheels;
 this.fast=fast;
 this.horseBreed=horseBreed;
 }
 
 Chariot(int noOfHorse, int noOfWheels, Boolean fast, String horseBreed, String horseColor)
 {
 System.out.println("Invoking const in Chariot");
 System.out.println("No Of Horses: " +noOfHorse);
 System.out.println("No Of Wheels: " +noOfWheels);
 System.out.println("Is Chariot is Fast: " +fast);
 System.out.println("Horse Breed: " +horseBreed);
 System.out.println("Horse Color: " +horseColor);
 this.noOfHorse=noOfHorse;
 this.noOfWheels=noOfWheels;
 this.fast=fast;
 this.horseBreed=horseBreed;
 this.horseColor=horseColor;
 }
 
 Chariot(int noOfHorse, int noOfWheels, Boolean fast, String horseBreed, String horseColor, float pricePerkm)
 {
 System.out.println("Invoking const in Chariot");
 System.out.println("No Of Horses: " +noOfHorse);
 System.out.println("No Of Wheels: " +noOfWheels);
 System.out.println("Is Chariot is Fast: " +fast);
 System.out.println("Horse Breed: " +horseBreed);
 System.out.println("Horse Color: " +horseColor);
 System.out.println("Price for Ride Per Km: " +pricePerkm);
 this.noOfHorse=noOfHorse;
 this.noOfWheels=noOfWheels;
 this.fast=fast;
 this.horseBreed=horseBreed;
 this.horseColor=horseColor;
 this.pricePerkm=pricePerkm;
 }
 
 Chariot(int noOfHorse, int noOfWheels, Boolean fast, String horseBreed, String horseColor, float pricePerkm, String horseOriginInState)
 {
 System.out.println("Invoking const in Chariot");
 System.out.println("No Of Horses: " +noOfHorse);
 System.out.println("No Of Wheels: " +noOfWheels);
 System.out.println("Is Chariot is Fast: " +fast);
 System.out.println("Horse Breed: " +horseBreed);
 System.out.println("Horse Color: " +horseColor);
 System.out.println("Price for Ride Per Km: " +pricePerkm);
 System.out.println("Birth Place Of Horse: " +horseOriginInState);
 this.noOfHorse=noOfHorse;
 this.noOfWheels=noOfWheels;
 this.fast=fast;
 this.horseBreed=horseBreed;
 this.horseColor=horseColor;
 this.pricePerkm=pricePerkm;
 this.horseOriginInState=horseOriginInState;
 }
 
 Chariot(int noOfHorse, int noOfWheels, Boolean fast, String horseBreed, String horseColor, float pricePerkm, String horseOriginInState, int horseWeight)
 {
 System.out.println("Invoking const in Chariot");
 System.out.println("No Of Horses: " +noOfHorse);
 System.out.println("No Of Wheels: " +noOfWheels);
 System.out.println("Is Chariot is Fast: " +fast);
 System.out.println("Horse Breed: " +horseBreed);
 System.out.println("Horse Color: " +horseColor);
 System.out.println("Price for Ride Per Km: " +pricePerkm);
 System.out.println("Birth Place Of Horse: " +horseOriginInState);
 System.out.println("Weight of horse: " +horseWeight);
 this.noOfHorse=noOfHorse;
 this.noOfWheels=noOfWheels;
 this.fast=fast;
 this.horseBreed=horseBreed;
 this.horseColor=horseColor;
 this.pricePerkm=pricePerkm;
 this.horseOriginInState=horseOriginInState;
 this.horseWeight=horseWeight;
 }
 
 Chariot(int noOfHorse, int noOfWheels, Boolean fast, String horseBreed, String horseColor, float pricePerkm, String horseOriginInState, int horseWeight, long maxCapacityOfhorse)
 {
 System.out.println("Invoking const in Chariot");
 System.out.println("No Of Horses: " +noOfHorse);
 System.out.println("No Of Wheels: " +noOfWheels);
 System.out.println("Is Chariot is Fast: " +fast);
 System.out.println("Horse Breed: " +horseBreed);
 System.out.println("Horse Color: " +horseColor);
 System.out.println("Price for Ride Per Km: " +pricePerkm);
 System.out.println("Birth Place Of Horse: " +horseOriginInState);
 System.out.println("Weight of horse: " +horseWeight);
 System.out.println("How many people can sit for one ride: " +maxCapacityOfhorse);
 this.noOfHorse=noOfHorse;
 this.noOfWheels=noOfWheels;
 this.fast=fast;
 this.horseBreed=horseBreed;
 this.horseColor=horseColor;
 this.pricePerkm=pricePerkm;
 this.horseOriginInState=horseOriginInState;
 this.horseWeight=horseWeight;
 this.maxCapacityOfhorse=maxCapacityOfhorse;
 }
 
 Chariot(int noOfHorse, int noOfWheels, Boolean fast, String horseBreed, String horseColor, float pricePerkm, String horseOriginInState, int horseWeight, long maxCapacityOfhorse, long noKMPerDay)
 {
 System.out.println("Invoking const in Chariot");
 System.out.println("No Of Horses: " +noOfHorse);
 System.out.println("No Of Wheels: " +noOfWheels);
 System.out.println("Is Chariot is Fast: " +fast);
 System.out.println("Horse Breed: " +horseBreed);
 System.out.println("Horse Color: " +horseColor);
 System.out.println("Price for Ride Per Km: " +pricePerkm);
 System.out.println("Birth Place Of Horse: " +horseOriginInState);
 System.out.println("Weight of horse: " +horseWeight);
 System.out.println("How many people can sit for one ride: " +maxCapacityOfhorse);
 System.out.println("How many km it can ride per day: " +noKMPerDay);
 this.noOfHorse=noOfHorse;
 this.noOfWheels=noOfWheels;
 this.fast=fast;
 this.horseBreed=horseBreed;
 this.horseColor=horseColor;
 this.pricePerkm=pricePerkm;
 this.horseOriginInState=horseOriginInState;
 this.horseWeight=horseWeight;
 this.maxCapacityOfhorse=maxCapacityOfhorse;
 this.noKMPerDay=noKMPerDay;
 }
 
 Chariot(int noOfHorse, int noOfWheels, Boolean fast, String horseBreed, String horseColor, float pricePerkm, String horseOriginInState, int horseWeight, long maxCapacityOfhorse, long noKMPerDay, Boolean Strong)
 {
 System.out.println("Invoking const in Chariot");
 System.out.println("No Of Horses: " +noOfHorse);
 System.out.println("No Of Wheels: " +noOfWheels);
 System.out.println("Is Chariot is Fast: " +fast);
 System.out.println("Horse Breed: " +horseBreed);
 System.out.println("Horse Color: " +horseColor);
 System.out.println("Price for Ride Per Km: " +pricePerkm);
 System.out.println("Birth Place Of Horse: " +horseOriginInState);
 System.out.println("Weight of horse: " +horseWeight);
 System.out.println("How many people can sit for one ride: " +maxCapacityOfhorse);
 System.out.println("How many km it can ride per day: " +noKMPerDay);
 System.out.println("Horse is Strong: " +strong);
 this.noOfHorse=noOfHorse;
 this.noOfWheels=noOfWheels;
 this.fast=fast;
 this.horseBreed=horseBreed;
 this.horseColor=horseColor;
 this.pricePerkm=pricePerkm;
 this.horseOriginInState=horseOriginInState;
 this.horseWeight=horseWeight;
 this.maxCapacityOfhorse=maxCapacityOfhorse;
 this.noKMPerDay=noKMPerDay;
 this.strong=strong;
 }
  
 }