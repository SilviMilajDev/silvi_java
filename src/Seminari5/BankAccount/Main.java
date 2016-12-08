package Seminari5.BankAccount;

public class Main
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount("asdasfa", "Silvi Milaj", 400);
        account.shto(100);
        account.terhiq(700);
        System.out.println(account.toString());

        System.out.println();
        BankAccount account_test = new BankAccount();
        account_test.shto(350);
        account_test.terhiq(150);
        System.out.println(account_test.toString());
    }
}
