package org.example.class4;

public class Donor {
    public static void main(String[] args) {
        int age = 25;
        int weight = 127;

        if (age >= 18) {
            if (weight >= 110 ) {
                System.out.println("You are eligible to donate the blood");
            } else {
                System.out.println("you are not eligible because of your weight");
            }
        } else {
            System.out.println("you are not eligible due to your age");
        }
    }
}
