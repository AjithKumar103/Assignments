package inheritance.bank;

public class SavingsAccount extends Account {
    private String name;

    public SavingsAccount(String bankName,String accountNo, String name) {
        super(accountNo,bankName);
        this.name = name;
    }
    @Override
    public void deposit(double amount){
        if (amount > 500000)
            super.deposit(amount - (amount * 0.003));
        else
            super.deposit(amount);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
