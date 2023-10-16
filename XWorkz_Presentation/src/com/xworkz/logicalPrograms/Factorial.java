package com.xworkz.logicalPrograms;

public class Factorial { //name of the class
    public static int factorial(int n) {  //declares a public static method name. The method is declared as Static, means we can call it without creating instance of class
        if (n == 0) {   //This line starts an if statement. It checks if the value of the integer n is equal to 0.
            return 1;   //If n is indeed equal to 0, this line is executed
        } else {        //If n is not equal to 0, this line is executed
            return n * factorial(n - 1);   //This line calculates the factorial of n by making a recursive call to the factorial method. It multiplies n by the factorial of n - 1. This is the recursive step of the factorial calculation.
        }
    }

    public static void main(String[] args) { //main method
        int n = 4;                           //This line declares an integer variable n and assigns it the value 5. 
        System.out.println("Factorial of " + n + " is " + factorial(n)); // Output: 120 //to print a message to the console
    }
}

