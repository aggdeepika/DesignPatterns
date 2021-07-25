package ATM;

import ATM.Account.Account;
import ATM.Account.SavingAccount;
import ATM.Bank.Address;
import ATM.Bank.Bank;
import ATM.Customer.Card;
import ATM.Customer.Customer;
import ATM.Transaction.Transaction;
import ATM.atmComponant.*;
import ATM.constants.CustomerStatus;
import ATM.constants.TransactionStatus;
import ATM.constants.TransactionType;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        //Build bank object
        Address address=new Address("adsds","12345","Delhi");
        Bank bank=new Bank("ICICI",address,"ICICI000879");
       //Build ATM object
        CashDispenser cashDispenser =new CashDispenser();
        Keypad keypad=new Keypad();
        Screen screen=new Screen();
        Printer printer =new Printer();
        DepositSlot depositSlot=new DepositSlot();

        ATM atm=new ATM(address,cashDispenser,keypad,printer,depositSlot,screen);

        // Build Customer Object
        Account savingAccount=new SavingAccount(1234567,1000,1000);
        Card card=new Card("5463465","Deepika",new Date(),1234);
        Customer customer =new Customer("Deepika","9958983085",address, CustomerStatus.ACTIVE,"garg131994@gmail.com",card,savingAccount);

// Draw Flow

        CardReader reader=new CardReader(card);
        screen.showMessage("Please enter your pin");
        int pin=sc.nextInt();
        boolean authenticateUser=reader.authenticateUser(pin);
        if(authenticateUser) {
            while (true) {
                screen.showMessage("Please enter Transaction Type");
                int tranaction = sc.nextInt();
                Transaction transaction = new Transaction();
                TransactionStatus status;
                switch (tranaction) {
                    case 1:
                         status=customer.makeTransaction(TransactionType.BALANCE_INQUIRY,0);
                         if(status==TransactionStatus.SUCCESS)
                             screen.showMessage("Transaction is successfull");
                         else
                             screen.showMessage("Network Issue !!!! Please retry");

                        break;
                    case 2:
                       status= customer.makeTransaction(TransactionType.WITHDRAW_CASH,500);
                        if(status==TransactionStatus.SUCCESS)
                            screen.showMessage("Transaction is successfull");
                            else
                            screen.showMessage("Available balance is less");
                            break;

                    case 3:
                        status=customer.makeTransaction(TransactionType.DEPOSIT_CASH,1000);
                        if(status==TransactionStatus.SUCCESS)
                            screen.showMessage("Transaction is successfull");
                             else
                            screen.showMessage("Network Issue !!!! Please retry");

                }

            }
        }
        else{
            System.exit(1);
        }













    }
}
