package ru.job4j.condition;

public class Max {
    public static  int max(int a, int b) {
        int result = a > b ? a : b;
        return result;
    }

    public static int max(int a, int b, int c) {
        return max(a, max(b, c));
    }

    public static int max(int a, int b, int c, int d) {
        return max(a, max(b, c, d));
    }

    public static void main(String[] arg) {
        int out = Max.max(5, 5);
        System.out.println(out);
    }

}

