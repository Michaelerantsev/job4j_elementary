package ru.job4j.converter;

public class converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = -1; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int euro = converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
    }
}


