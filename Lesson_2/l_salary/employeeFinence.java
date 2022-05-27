package OOP.Lesson_2.l_salary;

public class employeeFinence implements salary {
    private int oklad;

    public void setOklad(int oklad) {
        this.oklad = oklad;
    }

    @Override
    public int intSalary() {

        return this.oklad + 3*24;

    }
}
