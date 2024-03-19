package org.example.class4;

public class ElseIfTask5 {
    public static void main(String[] args) {
        double mortgagePrice = 124567.98;
        double mortgageRate = 2.6;

        if (mortgageRate > 4.5) {
            System.out.println("You cannot buy the house");
        } else {
            System.out.println("You should consider buying");
            if (mortgagePrice > 100000) {
                System.out.println("you need to take a loan");
            } else {
                System.out.println("You need to pay in cash");
            }
        }
    }
}
