public class StandardAccount implements IAccount {
    private int accountNumber;
    private double balance;
    private double creditLimit;

    public StandardAccount(int accountNumber, double creditLimit) {
        this.accountNumber = accountNumber;
        this.creditLimit = creditLimit;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return amount;
    }

    public double getCurrentBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
