package org.example.class5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        boolean hasCreditCard = scanner.nextBoolean();
        if (hasCreditCard) {
            System.out.println("What is your current balance?");
            double balance = scanner.nextDouble();
            if (balance > 1000){
                System.out.println("Please pay it off immediately");
            } else {
                System.out.println("You can spend more");
            }
        } else {
            System.out.println("We can offer a credit card to you");
        }

    }
}
