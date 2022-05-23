package OOP.Lesson_1.L_Furnitur;

public class Closet extends Furniture {

    public int Depth;

    public Closet(int weight, int height) {
        super(weight, height);
    }

    @Override
    public void ReturnColor() {
        System.out.println("Grey");
    }
}

