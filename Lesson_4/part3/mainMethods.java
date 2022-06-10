package OOP.Lesson_4.part3;

public class mainMethods {
    public static void main(String[] args) {

        methods var1 = null;
        methods var2 = null;
        methods var3 = null;
        methods var4 = null;
        try {
            var1 = new methods(6 ,2);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.printf("ділння,%s",var1.devide());

        try {
            var2 = new methods(0 ,25);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.printf("множення,%s",var2.mn());

        try {
            var3 = new methods(0 ,0);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.printf("Різниця,%s",var3.minus());

        try {
            var4 = new methods(-5 ,250);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.printf("Сумма,%s",var4.sum());

    }
}
