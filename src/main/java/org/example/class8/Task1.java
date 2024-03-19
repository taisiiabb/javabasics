package org.example.class8;

public class Task1 {
    public static void main(String[] args) {
        String[][] matrix = {
                {"Anna", "Henry", "Ginny", "Kyle", "Senya", "Laura"},
                {"A", "B", "C", "S", "A", "F"}
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                if (matrix[i][j].equals("A") || matrix[i][j].equals("B")) {
                    System.out.println(matrix[0][j] + " " + matrix[1][j]);
                }
            }
        }
    }
}
