package OOP.Lesson_5.bank;

public class CreditAccount extends account <Integer> {

    private int sum;

    public CreditAccount(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }
}
