package inheritance.bank;

public class CurrentAccount extends Account{
    private String name;
    private double overdraftLimit;
    // Constructor overload
    public CurrentAccount(String accountNo, String bankName, String name) {
        super(accountNo, bankName);
        this.name = name;
    }
    // Constructor overload
    public CurrentAccount(String accountNo, String bankName, String name, double overdraftLimit) {
        super(accountNo, bankName);
        this.name = name;
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount || Math.abs(getBalance() - amount) <= overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Exceeded overdraft limit. Current balance: $" + getBalance());
        }
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}


