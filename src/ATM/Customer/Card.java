package ATM.Customer;

import java.util.Date;

public class Card {

    private String cardNumber;
    private String cardHolderName;
    private Date expiryDate;
    private int pin;

    public Card() {
    }

    public Card(String cardNumber, String cardHolderName, Date expiryDate, int pin) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.pin = pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Card setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public Card setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
        return this;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public Card setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    public int getPin() {
        return pin;
    }

    public Card setPin(int pin) {
        this.pin = pin;
        return this;
    }
}
