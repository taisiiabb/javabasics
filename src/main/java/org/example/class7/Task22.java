package org.example.class7;

public class Task22 {
    public static void main(String[] args) {
        String [] halalAnimals = {"sheep", "cow",
                "turkey", "chicken", "horse"};

        System.out.println("First Loop 'For'");
        for (int i = 0; i < halalAnimals.length; i++) {
            System.out.println(halalAnimals[i]);
        }
        System.out.println("Second Loop 'While'");
        int j = 0;
        while (j< halalAnimals.length){
            System.out.println(halalAnimals[j]);
            j++;
        }
        System.out.println("Third Loop 'Enhanecd'");
        for (String halalAnimal : halalAnimals) {
            System.out.println(halalAnimal);
        }
    }
}
