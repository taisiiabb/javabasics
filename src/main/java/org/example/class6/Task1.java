package org.example.class6;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your country");

        String country = scanner.nextLine();
        switch (country) {
            case "USA" :
                System.out.println("We speak English");
                break;
            case "Spain":
                System.out.println("We speak Spanish");
            case "Russia":
                System.out.println("We speak Russian");
            case "Egypt":
                System.out.println("Arabic");
            default:
                System.out.println("Country not supported");
        }
    }
}
