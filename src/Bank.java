import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank {
    private List<IAccount> accounts = new ArrayList<>();

    public void openAccount(IAccount account) {
        accounts.add(account);
    }

    public IAccount getAccount(int accountNumber) {
        for (IAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public List<IAccount> getAllAccounts() {
        return accounts;
    }
    public void closeAccount(int accountNumber) {
        accounts.removeIf(account -> account.getAccountNumber() == accountNumber);
    }

    public List<IAccount> getAllAccountsInDebt() {
        List<IAccount> inDebt = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.getCurrentBalance() < 0) {
                inDebt.add(account);
            }
        }
        return inDebt;
    }

    public List<IAccount> getAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> withBalance = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.getCurrentBalance() > balanceAbove) {
                withBalance.add(account);
            }
        }
        return withBalance;
    }

}
