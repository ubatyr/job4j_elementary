package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] arg) {
        int out = Max.max(5, 5);
        System.out.println(out);
    }

}
