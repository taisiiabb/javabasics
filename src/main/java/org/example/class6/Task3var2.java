package org.example.class6;

import java.util.Scanner;

public class Task3var2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter number 1");
        double number1 = scanner.nextDouble();
        System.out.println("Enter number 2");
        double number2 = scanner.nextDouble();
        System.out.println("Enter operator");
        char operator = scanner.next().charAt(0);
        double result;

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("The result of " + operator + " operator is "+ result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("The result of " + operator + " operator is "+ result);
                break;
            case '*':
                result =(number1 * number2);
                System.out.println("The result of " + operator + " operator is "+ result);
                break;
            case '/':
                result =(number1 / number2);
                System.out.println("The result of " + operator + " operator is "+ result);
                break;
            default:
                System.out.println("Wrong operator");
        }

    }
}
