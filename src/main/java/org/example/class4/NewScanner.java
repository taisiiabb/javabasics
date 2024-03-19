package org.example.class4;

import java.util.Scanner;

public class NewScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter teh price of apples");
        double price = scan.nextDouble();
        System.out.println("Price of the apples is "+price);
    }
}
