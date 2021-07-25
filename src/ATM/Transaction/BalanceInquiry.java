package ATM.Transaction;

import ATM.Account.Account;

public class BalanceInquiry extends Transaction {

    private int accountId;
    public int getAccountId() {
        return accountId;
    }

    public BalanceInquiry setAccountId(int accountId) {
        this.accountId = accountId;
        return this;
    }

    public double getAccountBalance(Account account){
        return account.getTotalBalance();
    }



}
