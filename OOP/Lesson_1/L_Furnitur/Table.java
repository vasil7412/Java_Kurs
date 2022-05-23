package OOP.Lesson_1.L_Furnitur;

import OOP.Lesson_1.L_Furnitur.Furniture;

public class Table extends Furniture {

    public Table(int weight, int height) {
        super(weight, height);
    }

    @Override
    public void ReturnColor() {

        System.out.println("Black");

    }
}
