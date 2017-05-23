package Seminari15.Ushtrimi1;

public class BankAccount {
    private double balance;

    BankAccount() {
        balance = 0;
    }

    BankAccount(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void witdraw(double amount) {
        if (amount < balance)
            balance -= amount;
    }
}
