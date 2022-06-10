package OOP.Lesson_4.part2;

import java.util.Scanner;

public class mainSumm {
    public static void main(String[] args) throws NumberFormatException  {

        int a,b;

        Scanner sc = new Scanner(System.in);

        System.out.print("Vvedite chislo 1: ");
        try {a = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Введіть ціле число!");
            return;
        }
        System.out.print("Vvedite chislo 2: ");
        try {b= sc.nextInt();
        } catch (Exception e) {
            System.out.println("Введіть ціле число!");
            return;
        }

        int sum = a+b;

        System.out.printf("%s + %s = %s",a,b,sum);

    }
}
