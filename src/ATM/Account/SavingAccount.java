package ATM.Account;

import ATM.Account.Account;

public class SavingAccount extends Account {
    private int accountNumber;
    private double totalBalance;
    private double availableBalance;

    public SavingAccount() {
        super();

    }

    public SavingAccount(int accountNumber, double totalBalance, double availableBalance) {
        super(accountNumber, totalBalance, availableBalance);

    }
}
