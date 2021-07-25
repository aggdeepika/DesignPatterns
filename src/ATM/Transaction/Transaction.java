package ATM.Transaction;

import ATM.Account.Account;
import ATM.Customer.Customer;
import ATM.constants.TransactionStatus;
import ATM.constants.TransactionType;

import java.util.Date;

public  class Transaction {
    private int transactionId;
    private Date creationTime;
    private TransactionStatus tstatus;
    private String status;

    public String  makeTransaction(TransactionType transactionType, Customer customer, Double amount){

        switch(transactionType){
            case BALANCE_INQUIRY:
                BalanceInquiry balanceInquiry=new BalanceInquiry();
                Account account=customer.getAccount();
                System.out.println("balance of user is"+balanceInquiry.getAccountBalance(account));
                status="true";
               break;

            case WITHDRAW_CASH:
                WithdrawCash withdrawCash=new WithdrawCash();
                Account account1=customer.getAccount();
                 status=  withdrawCash.withdrawAmount(account1,amount);
                break;

            case DEPOSIT_CASH:
                DepositCash depositCash=new DepositCash();
                Account account2=customer.getAccount();
                 status=  depositCash.depositAmount(account2,amount);
                return status;

        }

       return status;
    }

}
