package Seminari11.CatchBankAccount;

public class Main
{
    public static void main(String[] args)
    {
        try {

            /* Change Values To See More Exceptions */
            BankAccount bank = new BankAccount(-1);
            bank.deposit(100);
            bank.deposit(-2);
            bank.withdraw(500);
            System.out.println(bank.getBalance());

        } catch ( IllegalArgumentException e ) {
            System.out.println(e.getMessage());
        }
    }
}
