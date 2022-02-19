package ru.job4j.condition;

public class MultipleSwitcWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Mondey" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        System.out.println(numberOfDay("Вторник"));
        System.out.println(numberOfDay("Sunday"));
        System.out.println(numberOfDay("Торт"));
    }
}
