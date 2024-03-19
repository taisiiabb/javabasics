package org.example.class4;

public class LargestNumber {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 467;
        int num3 = 6;

        if (num3 > num2 && num3 > num1 ) {
            System.out.println("Num3 is the largest number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Num2 is the largest number");
        } else {
            System.out.println("Num1 is the largest number");
        }
    }
}
