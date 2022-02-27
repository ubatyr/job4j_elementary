package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] nambers = new int[5];
        for (int index = 0; index < nambers.length; index++) {
            nambers[index] = index * 2 + 3;
        }
        for (int num : nambers) {
            System.out.println(num);
        }
    }
}

