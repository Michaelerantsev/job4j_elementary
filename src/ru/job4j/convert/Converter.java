package ru.job4j.convert;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(280);
        int in = 280;
        int expected = 4;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("280 rubles are " + euro + " euro.");
        System.out.println("280 rubles are 2. Test result : " + passed);

    }

}
