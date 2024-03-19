package org.example.class5;
//```Ask user to enter a number and then categorize if number is small,
// medium or large
//Small number is value between 1 and 10
//Medium number is value between 11 and 100
//Large number is value between 101 and 1000```

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter a random number");
        double randomNumber = scanner.nextDouble();

        if (randomNumber >= 1 && randomNumber <=10){
            System.out.println("It is a small number");
        } else if (randomNumber >= 11 && randomNumber <=100) {
            System.out.println("It is a medium number");
        } else if (randomNumber >= 101 && randomNumber <=1000) {
            System.out.println("It is a large number");
        } else {
            System.out.println("Wrong number");
        }
    }
}
