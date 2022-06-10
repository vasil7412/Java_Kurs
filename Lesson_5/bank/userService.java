package OOP.Lesson_5.bank;

import java.util.ArrayList;

public interface userService {
    public user userBank = null;
    public account userAccount = null;
    public debitAccount userDebitAccount = null;
    public CreditAccount userCreditAccount = null;

    public void showUsers(ArrayList <user> listUsers);
    public void showAccounts(ArrayList <account> listAccounts);
    public double tax(CreditAccount cA, debitAccount dA);

}
