package OOP.Lesson_4;

public class human  {
    private String name;
    private String email;
    private int old;

    public human(String name, String email, int old) {


        if (!email.contains("@")){
            throw new incorrectEmailException(name + " не вірний емейл");
        }

        if (old < 18 ){
            throw new underAgeException(name + " занадто молодий");
        }

        this.name = name;
        this.email = email;
        this.old = old;
    }

    public human() {
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getOld() {
        return old;
    }
}
