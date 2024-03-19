package org.example.class5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, I am a DMV specialist. How old are you?");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Congrats, your driver license is approved");
        } else {
            System.out.println("Sorry, but now you only qualify for a learners permit");
        }
    }
}
