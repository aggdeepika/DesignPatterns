package ATM.Transaction;

import ATM.Account.Account;

public class DepositCash extends Transaction {

    private double amount;

    public String  depositAmount(Account account, Double damount){
      double totalBalance=account.getTotalBalance();
      account.setTotalBalance(totalBalance+damount);
      return "true";
    }
}
