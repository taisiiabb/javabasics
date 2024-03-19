package org.example.class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature in F");
        double temperatureFar = scanner.nextDouble();
        System.out.println("Please enter your city");
        scanner.nextLine();
        String city = scanner.nextLine();

        double temperatureCels = (temperatureFar - 32) *5.0/9.0;
        System.out.println("The temperature in the " + city +" is "+ temperatureCels);
    }
}
