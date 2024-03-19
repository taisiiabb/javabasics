package org.example.class2;

public class Variables {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String city = "Houston";
        String state = "Texas";
        String phoneNumber = "123456789";

        System.out.println("My first " + firstName + " and my last name is " + lastName);
        System.out.println("I live in the city " + city + " and state " + state);
        System.out.println("And my phone number is " + phoneNumber);

        city = "Nashville";
        state = "Tennessee";
        phoneNumber = "662999288";

        System.out.println("My name is  and I moved to a new city " + city + " and new state " + state);
        System.out.println("My new phone number is " + phoneNumber);

    }
}