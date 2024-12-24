public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        IAccount premiumAccount = new PremiumAccount(111);
        IAccount standardAccount = new StandardAccount(112, 0);
        IAccount basicAccount = new BasicAccount(113, 0);
        bank.openAccount(standardAccount);
        bank.openAccount(basicAccount);

        System.out.println("All accounts:");
        for (IAccount account : bank.getAllAccounts()) {
            System.out.println("Account number: " + account.getAccountNumber() + " Balance: " + account.getCurrentBalance());
        }
    }
}
