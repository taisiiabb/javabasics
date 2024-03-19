package org.example.class9;

public class E5Arrays {
    public static void main(String[] args) {
        int [] numbers = {10,25,45,66,85,100};
        int sum = 0;
        double average;
        for (int n:numbers) {
            sum +=n;
        }
        average= (double) sum / numbers.length;
        System.out.println(average);
    }
}
