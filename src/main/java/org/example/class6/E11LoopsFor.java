package org.example.class6;

import java.util.Scanner;

public class E11LoopsFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("please enter the starting point of teh loop");
        int start = scanner.nextInt();
        System.out.println("Enter the stopping point");
        int stop = scanner.nextInt();

        while (start<stop+1) {
            System.out.println(start);
            start++;
        }

    }
}
