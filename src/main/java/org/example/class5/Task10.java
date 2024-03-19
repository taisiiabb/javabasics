package org.example.class5;
/* Write a program for user to enter his/hers birth month.
Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as
“You were born is season ______”.
 */

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter your birth month");
        int month = scanner.nextInt();

        if (month ==12 || month ==1 || month ==2) {
            System.out.println("You were born in Winter");
        } else if (month ==3 || month ==4 || month ==5) {
            System.out.println("You were born in Spring");
        } else if (month ==6 || month ==7 || month ==8) {
            System.out.println("You were born in Summer");
        } else if (month ==9 || month ==10 || month ==11) {
            System.out.println("You were born in Fall");
        }
    }
}
