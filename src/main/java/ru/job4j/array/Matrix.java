package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] tableMultiplication = new int[size][size];
        for (int i = 0; i < tableMultiplication.length; i++) {
            for (int j = 0; j < tableMultiplication[i].length; j++) {
                tableMultiplication[i][j] = (i + 1) * (j + 1);
            }
            
        }
        return tableMultiplication;
    }
}
