package OOP.Lesson_4;

public class mainHuman {
    public static void main(String[] args)  {

        try {
            human h1 = new human("R4","rr@rr.com",25);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            human h2 = new human("R2","ss$ss.com",25);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            human h3 = new human("R3","LL@rr.com",10);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
