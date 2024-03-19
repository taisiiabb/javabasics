package org.example.class5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of worked years");
        double years = scanner.nextInt();
        System.out.println("Please enter the annual salary");
        double salary = scanner.nextDouble();

        if (years>=5) {
            System.out.println("you are eligible for a bonus");
            if (salary > 50000) {
                System.out.println("Your bonus is 5000");
            } else {
                System.out.println("Your bonus is 3000");
            }
        } else {
            System.out.println("you are not eligible for a bonus");
        }
    }
}
