package org.example.class4;

public class ElseIfTask4 {
    public static void main(String[] args) {
        boolean hasDegree = true;
        double gpaScore = 3.4;

        if (hasDegree == true) {
            System.out.println("Congratulations");
            if (gpaScore >= 3.5) {
                System.out.println("You are eligible for a scholarship");

            } else {
                System.out.println("you should have studied harder");
            }

        } else {
            System.out.println("you should get a degree");
        }
    }
}
