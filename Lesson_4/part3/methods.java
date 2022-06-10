package OOP.Lesson_4.part3;

public class methods {

    private double a;
    private double b;

    public methods(double a, double b) throws IllegalAccessException {

        if (
                a<0 && b < 0
        ) throw  new IllegalArgumentException(" a i b менші 0");

        if (
                (a==0 && b != 0) |  (a!=0 && b == 0)
        ) throw  new ArithmeticException(" a або b = 0");

        if ( a==0 && b == 0
        ) throw  new IllegalAccessException (" a i b = 0");

        if (
                a>0 && b > 0
        ) throw  new myExceptions(" a i b більші 0");

        this.a = a;
        this.b = b;
    }

    public double sum(){

        return this.a + this.b;

    }
    public double minus(){

        return this.a - this.b;

    }
    public double mn(){

        return this.a * this.b;

    }
    public double devide(){

        return this.a / this.b;

    }



}
