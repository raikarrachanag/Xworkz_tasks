package com.xworkz.festival;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<String> festivalNames = new ArrayList<>();
        festivalNames.add("Dasara");
        festivalNames.add("Christmas");
        festivalNames.add("Maha Shivarathri");
        festivalNames.add("Holi");
        festivalNames.add("Diwali");
        festivalNames.add("Rama Navami");
        festivalNames.add("Raksha Bandan");
        festivalNames.add("Varamaha-Lakshmi Vratha");
        festivalNames.add("Yugadhi");
        festivalNames.add("Navratri");
        festivalNames.add("Pongal");
        festivalNames.add("Makara Sankranti");
        festivalNames.add("Raksha Bandhan");
        festivalNames.add("Ganesh Chaturthi");
        festivalNames.add("Onam");

        System.out.println("List of Festival Names:");
        festivalNames.forEach(System.out::println);

        System.out.println("====================================");

        System.out.println("\nFestival Names with more than 6 characters:");
        festivalNames.stream()
            .filter(festival -> festival.length() > 6)
            .forEach(System.out::println);
        
        System.out.println("====================================");

        System.out.println("\nFestival Names with less than 6 characters:");
        festivalNames.stream()
            .filter(festival -> festival.length() < 6)
            .forEach(System.out::println);
        
        System.out.println("====================================");
        
        System.out.println("\nFestival Names containing 'O' or 'o':");
        List<String> oContainingFestivalNames = festivalNames.stream()
            .filter(festival -> festival.contains("O") || festival.contains("o"))
            .collect(Collectors.toList());

        oContainingFestivalNames.forEach(System.out::println);
        
        System.out.println("====================================");
        
        System.out.println("\nFestival Names not containing 'g':");
        List<String> notContainingGFestivalNames = festivalNames.stream()
            .filter(festival -> !festival.toLowerCase().contains("g"))
            .collect(Collectors.toList());

        notContainingGFestivalNames.forEach(System.out::println);
        
        System.out.println("====================================");
        
        System.out.println("\nFestival Names ending with 'S' (upper or lower case):");
        festivalNames.stream()
            .filter(festival -> festival.toLowerCase().endsWith("s"))
            .forEach(System.out::println);
   
        System.out.println("====================================");
        
        System.out.println("\nFestival Names containing 'Z' or 'R':");
        List<String> containingZRNames = festivalNames.stream()
            .filter(festival -> festival.contains("Z") || festival.contains("R"))
            .collect(Collectors.toList());

        containingZRNames.forEach(System.out::println);
    
        System.out.println("====================================");
        
        System.out.println("\nFestival Names containing 'Ram':");
        List<String> containingRamNames = festivalNames.stream()
            .filter(festival -> festival.contains("Ram"))
            .collect(Collectors.toList());

        containingRamNames.forEach(System.out::println);
    
    }
}
