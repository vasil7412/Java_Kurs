package OOP.Lesson_2.l_salary;

public class mainSalary {
    public static void main(String[] args) {

        employeeDevelop develop = new employeeDevelop();
        employeeFinence finance = new employeeFinence();

        finance.setOklad(250);

        System.out.println("заробітня плата фінансиста " + finance.intSalary());
        System.out.println("заробітня плата розробника " + develop.intSalary());

    }

}
