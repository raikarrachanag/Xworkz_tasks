package com.xworkz.role;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamRunner {

    public static void main(String[] args) {
        Collection<String> roleCollection = new LinkedList<String>();
        roleCollection.add("Software Engineer");
        roleCollection.add("Java Developer");
        roleCollection.add("Human Resources");
        roleCollection.add("Recruiter");
        roleCollection.add("Automation Tester");
        roleCollection.add("Performance Tester");
        roleCollection.add("Software Developer");
        roleCollection.add("Business Analyst");
        roleCollection.add("Web Developer");
        roleCollection.add("Manager");

        for (String role : roleCollection) {
            if (role.endsWith("Tester")) {
                System.out.println(role);
            }
        }
        System.out.println("=========================");
        roleCollection.stream().filter((role) -> role.endsWith("Tester")).forEach(r -> System.out.println(r));

        System.out.println("==========================");
        roleCollection.stream().filter(r -> r.endsWith("r")).forEach(r -> System.out.println(r));

        List<String> rolesWithMList = roleCollection.stream()
                .filter(r -> r.contains("m"))
                .collect(Collectors.toList()); // Corrected this line

        System.out.println("==========================");
        for (String role : rolesWithMList) {
            System.out.println(role);
        }
    }
}
