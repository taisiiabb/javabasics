package org.example.class9;

public class E3Arrays {
    public static void main(String[] args) {
        int [] numbers = {10, 25, 45, 66, 85, 100};
        double average;
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        average = sum/ numbers.length;
        System.out.println(average);
    }
}
