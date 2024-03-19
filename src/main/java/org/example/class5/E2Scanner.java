package org.example.class5;

import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a byte number");
        byte smallBox = scanner.nextByte();
        System.out.println("Please enter a double number");
        double mediumBox = scanner.nextDouble();
        System.out.println("Enter bool");
        boolean boolBox = scanner.nextBoolean();

        System.out.println(smallBox);
        System.out.println(mediumBox);
        System.out.println(boolBox);

    }
}
