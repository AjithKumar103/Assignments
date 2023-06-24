package inheritance.bank;

public class Account {
    private String bankName;
    private String accountNo;
    private double balance;

    public Account(String accountNo,String bankName) {
        this.accountNo = accountNo;
        this.bankName = bankName;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit of Rs. " + amount + " Successfull." );
        System.out.println("Your current balance Rs. " + balance);
    }
    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("Withdraw of Rs. " + amount + " Successfull." );
            System.out.println("Your current balance Rs. " + balance);
        }
        else {
            System.out.println("Insufficient balance!!!");
            System.out.println("Current balance Rs." + balance);
        }
    }
    public double getBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "bankName='" + bankName + '\'' +
                ", accountNo=" + accountNo +
                ", balance=" + balance +
                '}';
    }
}
