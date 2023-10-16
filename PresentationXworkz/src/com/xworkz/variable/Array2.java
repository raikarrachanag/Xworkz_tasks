package com.xworkz.variable;

public class Array2{

    public static void main(String[] args) {
        
        String[] states = {"Karnataka", "Tamil nadu", "Delhi", "Maharastra", "Kerala"};

      
        for (int i = 0; i < states.length; i++) {
            System.out.println("States name at index " + i + ": " + states[i]);
        }
    }
}