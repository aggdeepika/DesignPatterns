package ATM.atmComponant;

import ATM.constants.TransactionType;

public class Screen {
    public boolean showMessage(String message){
        System.out.println("message is"+message);
        return true;
    }
    public TransactionType getInput(){
      return  TransactionType.WITHDRAW_CASH;
    }
}
