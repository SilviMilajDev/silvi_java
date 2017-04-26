package Seminari11.CatchBankAccount;

public class BankAccount
{
    private double balance;

    BankAccount() {
        balance = 0;
    }

    BankAccount(double b) throws IllegalArgumentException {
        if (b < 0)
            throw new IllegalArgumentException("The balance can not be negative.");
        balance = b;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0)
            throw new IllegalArgumentException("The Deposit amount must be greater than 0.");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance)
            throw new IllegalArgumentException("The Withdraw amount must be less than the balance.");
        balance -= amount;
    }
}
