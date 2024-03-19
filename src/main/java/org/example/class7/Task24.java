package org.example.class7;

public class Task24 {
    public static void main(String[] args) {
        int[] numbers = {-33, -5, -76, -2345, -54, -456, -23425, -6745};
        int max = numbers[0];
        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        System.out.println("The max number is "+ max);
    }
}
