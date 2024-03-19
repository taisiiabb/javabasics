package org.example.class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your desired loan amount");
        int loanAmount = scanner.nextInt();
        if (loanAmount <= 200000) {
            System.out.println("Your application is approved");
        } else {
            System.out.println("Sorry, not this time");
        }
    }
}
