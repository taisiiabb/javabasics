package org.example.class6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter number 1");
        double number1 = scanner.nextDouble();
        System.out.println("Enter number 2");
        double number2 = scanner.nextDouble();
        System.out.println("Enter operator");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("The result for + operator is " + (number1 + number2));
                break;
            case '-':
                System.out.println("The result for - operator is " + (number1 - number2));
                break;
            case '*':
                System.out.println("The result for * operator is " + (number1 * number2));
                break;
            case '/':
                System.out.println("The result for / operator is " + (number1 / number2));
                break;
            default:
                System.out.println("Wrong operator");
        }
    }
}
