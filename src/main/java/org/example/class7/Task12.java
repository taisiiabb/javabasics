package org.example.class7;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        String [] names1 = {"Ana", "Casey", "Taia",
                "Jinny", "Peter", "Hanna"};
        System.out.println((names1[2]));

        String [] names2 = new String[5];
        names2[0] = "Cassandra";
        names2[1] = "Victor";
        names2[2] = "Manny";
        names2[3] = "Lanny";
        names2[4] = "Ricky";
        String sp = " ";

        System.out.println(names2[1]+ sp +
                names2[0] + sp + names2[4]);

    }
}
