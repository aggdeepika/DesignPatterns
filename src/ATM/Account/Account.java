package ATM.Account;

public   class Account {

    private int accountNumber;
    private double totalBalance;
    private double availableBalance;

    public Account() {
    }

    public Account(int accountNumber, double totalBalance, double availableBalance) {
        this.accountNumber = accountNumber;
        this.totalBalance = totalBalance;
        this.availableBalance = availableBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Account setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public Account setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
        return this;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public Account setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
        return this;
    }


}
