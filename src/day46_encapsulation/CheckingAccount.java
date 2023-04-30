package day46_encapsulation;

public class CheckingAccount {
    private double balance;
    private long accountNumber;
    private String accountHolder;
    private String type = "checking"; //default is checking

    //right click > generate > getter and setter - select all and press OK


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setAccountInfo (long accountNumber, String accountHolder, double balance, String type) {
        setType(type);
        setAccountHolder(accountHolder);
        setBalance(balance);
        setAccountNumber(accountNumber);
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
