package com.xworkz.logicalPrograms;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        //The program then reads an integer (the year) entered by the user and stores it in the year variable.

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
        //we close the Scanner to release resources associated with it.
    }

    public static boolean isLeapYear(int year) {
    	//This line defines the isLeapYear method, which takes an integer year as its parameter. This method checks if the input year is a leap year or not.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        	//Inside the isLeapYear method, this line checks the condition for a leap year
        	//It is divisible by 4 and not divisible by 100.
        	//It is divisible by 400.
            return true;
        } else {
            return false;
        }
    }
}
