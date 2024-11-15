package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < table.length; row++) {
            for (int cell = 0; cell < table[row].length; cell++) {
                int var = (row + 1) * (cell + 1);
                table[row][cell] = var;
            }
        }
        return table;
    }
}