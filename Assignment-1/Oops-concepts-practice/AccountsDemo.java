package inheritance.bank;


public class AccountsDemo {
    public static void main(String[] args) {
        // SavingAccount inherits Account
        SavingsAccount sac = new SavingsAccount("SBI","SBI2325453","Ajiht");
        // Using interface to calculate interest rate
        InterestCalculator interestRate = new SBIInterest();
        System.out.println("Current Balance: Rs. " + sac.getBalance());
        System.out.println("======================================");
        sac.deposit(30000);
        System.out.println("======================================");
        sac.withdraw(6000);
        System.out.println("======================================");
        sac.deposit(600000);
        System.out.println("======================================");
        System.out.printf("Interest Rate for current balance of per day: Rs. %.2f",interestRate.calculateInterest(sac.getBalance()));
    }
}
