package org.example.class4;

import java.util.Scanner;

public class MultipleScanners {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        System.out.println("Please enter your salary");
        double salary = scan.nextDouble();
        System.out.println("My name is "+ name +" and my age is "+age+ " and my salary is "+ salary);
    }
}
