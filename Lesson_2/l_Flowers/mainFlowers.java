package OOP.Lesson_2.l_Flowers;

import OOP.Lesson_1.L_Robots.Robot;

public class mainFlowers {
    public static void main(String[] args) {

        flowers[] flowers = new flowers[3];
        flowers flowers1 = new flowers(3,"blue");


        flowers[0] = flowers1;
        flowers[1] = new roze(5,"Roze");
        flowers[2] = new tulip(6,"White");

        int allPrice = 0;

        for ( flowers item: flowers) {
            allPrice = allPrice + item.getPrice();
        }

        System.out.println("Ціна букету:" + allPrice);

    }

}
