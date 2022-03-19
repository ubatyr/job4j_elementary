package ru.job4j.condition;

public class Max {
    public static  int max(int a, int b) {
        int result = a > b ? a : b;
        return result;
    }

    public static int max(int a, int b, int c) {
        int result = a > max(b, c) ? a : max(b, c);
        return result;
    }

    public static int max(int a, int b, int c, int d) {
        int result = a > max(b, c, d) ? a : max(b, c, d);
        return result;
    }

    public static void main(String[] arg) {
        int out = Max.max(5, 5);
        System.out.println(out);
    }

}

