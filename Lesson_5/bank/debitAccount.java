package OOP.Lesson_5.bank;

public class debitAccount extends account <String> {

private int sum;

    public debitAccount(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }
}
