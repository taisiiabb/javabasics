package org.example.class1;

public class VariableValues {
    public static void main(String[] args) {
        int newInt = 3;
        char newChar = 'R';
        boolean newBool = false;
        short newShort = 12;
        double newDouble = 2.3;
        float newFloat = 2.338763f;
        long newLong = 82679890567896789L;
        byte newByte = 127;

        System.out.println(newInt);
        System.out.println(newByte);
        System.out.println(newChar);
        System.out.println(newBool);
        System.out.println(newFloat);
        System.out.println(newDouble);
        System.out.println(newLong);
        System.out.println(newShort);

        newInt = 3;
        newChar = 'L';
        newBool = true;
        newShort = 34;
        newDouble = 12.8;
        newFloat = 5.56784f;
        newLong = 9876543345678876L;
        newByte = 26;

        System.out.println("Let's change the values");
        System.out.println(newInt);
        System.out.println(newByte);
        System.out.println(newChar);
        System.out.println(newBool);
        System.out.println(newFloat);
        System.out.println(newDouble);
        System.out.println(newLong);
        System.out.println(newShort);
    }

}
