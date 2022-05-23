package OOP.Lesson_1;

public class Main_l1 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle_p = new Rectangle(10,15);

        int width = rectangle.getWidth();
        int height = rectangle.getHeight();

        int p = (width + height) * 2;
        int s = width * height;

        System.out.println("Площа прямокутника = " + p);
        System.out.println("Периметр прямокутника = " + s);

        int width_p = rectangle_p.getWidth();
        int height_p = rectangle_p.getHeight();

        int p2 = (width_p + height_p) * 2;
        int s2 = width_p * height_p;

        System.out.println("Площа прямокутника (конструктор з параметрами) = " + p2);
        System.out.println("Периметр прямокутника = (конструктор з параметрами) = " + s2);


    }

}
