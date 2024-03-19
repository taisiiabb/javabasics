package org.example.class6;

import java.util.Scanner;
/*
Allow user to enter grade (A, B, or C etc...) and
then provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
any other grade --> Not Acceptable. At the end your program should
print which grade was entered by a user with explanation.
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter the grade");
        char grade = scanner.next().toUpperCase().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("A = Excellent");
                break;
            case 'B':
                System.out.println("B = Good");
                break;
            case 'C':
                System.out.println("C-Average");
                break;
            case 'D':
                System.out.println("D-bad");
                break;
            default:
                System.out.println("Grade not supported");
        }
    }
}
