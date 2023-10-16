package com.xworkz.logicalPrograms;

import java.util.Scanner; //import scanner

public class PalindromeChecker { //class

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//create a Scanner object named scanner to read input from the user. 
                                                  //We use System.in as the input source, which represents the standard input stream (typically the keyboard).
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
//The program then reads an integer entered by the user and stores it in the number variable.
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        //Here, we declare and initialize two variables, originalNumber to store the original input number, and reversedNumber to store the reversed number (initialized to 0).

        while (number > 0) {//This line starts a while loop that continues until number is greater than 0. 
            int digit = number % 10;
            //Inside the loop, we calculate the last digit of the number using the modulus operator and store it in the digit variable.
            reversedNumber = reversedNumber * 10 + digit;
            //We reverse the digits of the number by multiplying reversedNumber by 10 and adding the digit. This effectively "shifts" the digits to the left in the reversed number and adds the current digit to the right.
            number /= 10;
            //We remove the last digit from number by dividing it by 10, effectively shifting the number to the right.
        }

        return originalNumber == reversedNumber;
        //After the loop, we compare the original number (originalNumber) with the reversed number (reversedNumber). If they are equal, the method returns true, indicating that the number is a palindrome; otherwise, it returns false.
    }
}
