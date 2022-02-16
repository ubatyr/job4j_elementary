package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rls;
        if (number % 3 == 0 && number % 2 == 0) {
            rls = "Исходное число делится на 6.";
        } else if (number % 3 == 0) {
            rls = "Исходное число делится на 3, но не является четным.";
        } else  if (number % 2 == 0) {
            rls = "Исходное число не делится на 3, но является четным.";
        } else {
            rls = "Исходное число не делится на 3 и не является четным.";
        }
        return rls;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(24));
        System.out.println(checkNumber(9));
        System.out.println(checkNumber(14));
        System.out.println(checkNumber(25));
    }
}
