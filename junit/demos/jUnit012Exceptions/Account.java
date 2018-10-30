

public class Account {
    private String accountHolder;
    private double amount;

    public Account(String accountHolder, double amount) {
        this.accountHolder = accountHolder;
        this.amount = amount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
