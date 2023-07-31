public class SavingsAccount extends BankAccount
{
    private double rate = 0.025;
    private static int savingsNumber = 0;
    private String accountNumber;

    //constructor
    public SavingsAccount(String name, double amount)
    {
        super(name, amount);
        this.accountNumber = (super.getAccountNumber() + "-" + savingsNumber);
    }

    public void postInterest()
    {
        super.deposit((rate/12)*super.getBalance());
    }

    //overridden getAcountNumber method
    public String getAccountNumber()
    {
        return this.accountNumber;
    }

    //copy constructor
    public SavingsAccount(SavingsAccount newAcc, double amount)
    {
        super(newAcc, amount);
        savingsNumber++;
        this.accountNumber = newAcc.accountNumber;
    }

}