package ATM.Transaction;

import ATM.Account.Account;
import ATM.Transaction.Transaction;

public class WithdrawCash  extends Transaction {
    private double amount;

    public String withdrawAmount(Account account, double amount){
        double totalAmount=account.getTotalBalance();
        if(amount>totalAmount){
            return "false";
        }
        else{
            account.setTotalBalance(totalAmount-amount);
            return "true";
        }

    }

}
