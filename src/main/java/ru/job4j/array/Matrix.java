package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int index = 0; index < size; index++) {
            for (int j = 0; j < size; j++) {
                array[index][j] = (index + 1) * (j + 1);
            }
        }
        return array;
    }
}
