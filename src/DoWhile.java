import java.util.Scanner;

public class DoWhile {
   public static void main(String[]args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Введи 7");
       int value = scanner.nextInt();
       while (value != 7) {
           System.out.println("Введи 7.");
           value = scanner.nextInt();
       }
       System.out.println("Вы ввели 7.");
   }
   }