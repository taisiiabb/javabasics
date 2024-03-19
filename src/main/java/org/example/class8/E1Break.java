package org.example.class8;

public class E1Break {
    public static void main(String[] args) {
        String [] names = {"James", "Iram", "Matt Vaughn", "Ubaidur", "Aladin", "Silvea" };

        for (String n:names){
            if(n.equals("Ubaidur")){
                System.out.println(n+" is present");
                break;
            }
        }
    }
}
