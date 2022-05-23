package OOP.Lesson_1.L_Robots;

public class MainRobot {
    public static void main(String[] args) {

        Robot Robot                 = new Robot();
        CoffeRobot CoffeRobot       = new CoffeRobot();
        RobotCoocker RobotCoocker   = new RobotCoocker();
        RobotDancer RobotDancer     = new RobotDancer();

        Robot[] Robots = new Robot[4];

        Robots[0] = Robot;
        Robots[1] = CoffeRobot;
        Robots[2] = RobotCoocker;
        Robots[3] = RobotDancer;

        for (Robot item: Robots) {

            item.work();

        }

    }

}
