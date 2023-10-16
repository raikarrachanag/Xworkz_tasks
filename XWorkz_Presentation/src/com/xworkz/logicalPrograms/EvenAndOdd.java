package com.xworkz.logicalPrograms;

import java.util.Scanner; //importing the scanner

public class EvenAndOdd {  //java class

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //create a Scanner object named scanner to read input from the user. 

        System.out.print("Enter a number: "); //display msg to the user
        int number = scanner.nextInt();//This line reads an integer entered by the user and stores it in the number variable.

        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        scanner.close();//close the Scanner to release the resources associated with it.
    }

    // Function to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0; //returns true if the number is even (i.e., the remainder when dividing by 2 is 0) 
    }
}

