package OOP.Lesson_4.part2;

import java.util.Scanner;

public class mainCorrect {

    public static void main(String[] args) throws NumberFormatException {
        int i = 0;
        boolean isException = false;

        Scanner sc = new Scanner(System.in);

        System.out.print("Vvedite chislo");
        try {i = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Введіть ціле число!");
            isException = true;

        }

        if (isException = false) {
            if ( i % 2 == 0) {
                System.out.println("" + i + " - парне");
            } else {
                System.out.println("" + i + " - не парне");
            }
        }

    }
}
