package org.example.class9;

public class E6Arrays {
    public static void main(String[] args) {
        int [] numbers = {10,25,45,66,85,100};
        int sum = 0;
        double average;
        int counter = 0;
        for (int number : numbers) {
            if (number > 25) {
                sum += number;
                counter ++;
            }
        }
        average= (double) sum / counter;
        System.out.println(average);
    }
}
