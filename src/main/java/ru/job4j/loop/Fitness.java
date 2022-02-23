package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int mouth = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            mouth += 1;
        }
        return mouth;
    }
}
