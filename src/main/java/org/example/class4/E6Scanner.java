package org.example.class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        //creating the object scanner - for taking
        // the input from the keyboard
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scan.nextInt();
        System.out.println("You are "+ age+" years old");
    }
}
