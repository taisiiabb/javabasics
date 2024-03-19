package org.example.class5;

/*
Write a program that will read three inputs of scores
(quiz, mid term, and final scores) and determine the
grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
 */


import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Quiz grade");
        double quizGrade = scanner.nextDouble();
        System.out.println("Please enter Mid term grade");
        double midtermGrade = scanner.nextDouble();
        System.out.println("Please enter Final grade");
        double finalGrade = scanner.nextDouble();

        double averageGrade = (quizGrade + midtermGrade + finalGrade)/3;

        if (averageGrade >= 90) {
            System.out.println("You get a grade A");
        } else if (averageGrade >= 70) {
            System.out.println("You get a grade B");
        } else if (averageGrade >= 50) {
            System.out.println("You get a grade C");
        } else if (averageGrade < 50) {
            System.out.println("You get a grade D");
        } else System.out.println("Wrong grade");
    }
}
