package ATM.atmComponant;

import ATM.Bank.Address;

public class ATM {

    private String atmId="1234";
    private Address location;
    private CashDispenser cashDispenser;
    private Keypad keypad;
    private Printer printer;
    private DepositSlot depositSlot;
    private Screen screen;

    public ATM(Address location, CashDispenser cashDispenser, Keypad keypad, Printer printer, DepositSlot depositSlot, Screen screen) {
        this.location = location;
        this.cashDispenser = cashDispenser;
        this.keypad = keypad;
        this.printer = printer;
        this.depositSlot = depositSlot;
        this.screen = screen;
    }
}
