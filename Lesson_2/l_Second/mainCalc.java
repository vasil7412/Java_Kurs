package OOP.Lesson_2.l_Second;

public class mainCalc {
    public static void main(String[] args) {
        myCalculator myCalculator = new myCalculator();

        System.out.println("Сума 200+300 = " + myCalculator.plus(200,300));
        System.out.println("Різниця 750-223 = " + myCalculator.minus(750,223));
        System.out.println("Множення 13*113 = " + myCalculator.multiply(13,113));
        System.out.println("Ділення 400/200 = " + myCalculator.devide(400,200));

    }

}
