package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedEuro = 2;
        float expectedDollar = (float) 2.3333333333;
        float euro = Converter.rubleToEuro(in);
        float dollar = Converter.rubleToDollar(in);
        boolean passedEuro = expectedEuro == euro;
        boolean passedDollar = expectedDollar == dollar;
        System.out.println("140 rubles are " + euro + " euro - " + passedEuro);
        System.out.println("140 rubles are " + dollar + " dollar - " + passedDollar);
    }
}
