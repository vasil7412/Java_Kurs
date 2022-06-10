package OOP.Lesson_5.bank;

import java.util.ArrayList;

public class userServiceClass implements userService {
    @Override
    public void showUsers(ArrayList<user> listUsers) {
        for (user item :listUsers) {
            System.out.println(item.getName());
        }
    }

    @Override
    public void showAccounts(ArrayList<account> listAccounts) {
        for (account item :listAccounts) {
            System.out.println("" + item.id);
        }
    }

    @Override
    public double tax(CreditAccount cA, debitAccount dA) {
        return (cA.getSum() + dA.getSum())*0.05;
    }
}
