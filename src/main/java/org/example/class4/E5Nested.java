package org.example.class4;

public class E5Nested {
    public static void main(String[] args) {
        boolean mainDoor = false;
        boolean room1 = false;
        boolean room2 = true;

        if (mainDoor) {
            if (room1) {
                System.out.println("Room 1 is open");
            } else {
                System.out.println("Room 1 is closed");
            }

            if(room2){
                System.out.println("Room 2 is open");
            } else {
                System.out.println("Room 2 is Closed");
            }

        } else{
            System.out.println("Main Door is closed");
        }
    }
}
