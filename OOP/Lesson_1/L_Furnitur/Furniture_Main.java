package OOP.Lesson_1.L_Furnitur;

public class Furniture_Main {
    public static void main(String[] args) {

        Closet closet = new Closet(4,5);

        System.out.print("Колір шкафа: ");
        closet.ReturnColor();

        Table table = new Table(15,16);

        System.out.print("Колір столу: ");

        table.ReturnColor();

        System.out.println("Периметр столу:" + table.ReturnPerimeter());

    }

}
