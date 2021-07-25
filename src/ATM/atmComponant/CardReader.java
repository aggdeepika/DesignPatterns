package ATM.atmComponant;

import ATM.Customer.Card;

public class CardReader {


    private Card card;
    public CardReader(Card card) {
        this.card = card;
    }

    public boolean authenticateUser(int pin){
        if(pin==card.getPin())
            return true;
        else
            return false;
    }


}
