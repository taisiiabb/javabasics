package org.example.class4;

public class E4Nested1 {
    public static void main(String[] args) {
        boolean mainDoor = true;
        boolean room1 = false;
        boolean room2 = false;

        if (mainDoor) {

            if (room1) {
                System.out.println("Room 1");
            } else {
                System.out.println("Room 1 is closed");

            }

        } else {
            System.out.println("Main door is closed");
        }
    }
}
