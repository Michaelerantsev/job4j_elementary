package ru.job4j.calculator;

  public class converter {



      public static int rubleToDollar(int value) {
          int rsl = value / 60;
          return rsl;
      }

      public static void main(String[] args) {
          int dollar = converter.rubleToDollar(800);
          System.out.println("800 rubles are "+ dollar  + " dollar.");

      }
  }

