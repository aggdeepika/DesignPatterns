package ATM.Customer;

import ATM.Account.Account;
import ATM.Bank.Address;
import ATM.Transaction.Transaction;
import ATM.constants.CustomerStatus;
import ATM.constants.TransactionStatus;
import ATM.constants.TransactionType;

public class Customer {

    private String name;
    private String phoneNumber;
    private Address address;
    private CustomerStatus status;
    private String email;

    private Card card;
    private Account account;
    private Transaction transaction;

    public Customer(String name, String phoneNumber, Address address, CustomerStatus status, String email, Card card, Account account) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.status = status;
        this.email = email;
        this.card = card;
        this.account = account;
    }

    public Customer() {
    }



    public TransactionStatus makeTransaction(TransactionType transactionType, double amount){

        transaction=new Transaction();
        String status=transaction.makeTransaction(transactionType,this,amount);
        return status.equalsIgnoreCase("true")?  TransactionStatus.SUCCESS:TransactionStatus.FAILURE;
    };

    public Card getCard() {
        return card;
    }

    public Customer setCard(Card card) {
        this.card = card;
        return this;
    }

    public Account getAccount() {
        return account;
    }

    public Customer setAccount(Account account) {
        this.account = account;
        return this;
    }
}
