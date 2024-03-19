package org.example.class7;

public class Task21 {
    public static void main(String[] args) {
        String [] cars = {"BMW", "Mercedes",
                "Audi", "Lexus", "Honda", "Toyota"};
        System.out.println(cars.length);
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("this is a break between the loops");
        int j =0;
        while(j<cars.length){
            System.out.println(cars[j]);
            j++;
        }
    }
}
