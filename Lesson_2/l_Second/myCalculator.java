package OOP.Lesson_2.l_Second;

import OOP.Lesson_2.l_Nurable.iNumerable;

public class myCalculator implements iNumerable  {
    @Override
    public double devide(int a, int b) {
        return (int)a/b;
    }

    @Override
    public int minus(int a, int b) {
        return a-b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public int plus(int a, int b) {
        return a+b;
    }


}
