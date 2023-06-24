package inheritance.bank;


public class AccountsMain {
    public static void main(String[] args) {
        // SavingAccount and CurrentAccount inherits Account
        SavingsAccount sac = new SavingsAccount("SBI","SBI2325453","Ajiht");
        // Using abstract class to calculate interest rate
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

        SavingsAccount sac2 = new SavingsAccount("IDFC","325295792idfc","Kumar");
        InterestCalculator interestRate2 = new IDFCInterest();
        System.out.println("Current Balance: Rs. " + sac2.getBalance());
        System.out.println("======================================");
        sac2.deposit(40000);
        System.out.println("======================================");
        sac2.withdraw(10000);
        System.out.println("======================================");
        sac2.deposit(400000);
        System.out.println("======================================");
        System.out.printf("Interest Rate for current balance of per day: Rs. %.2f",interestRate2.calculateInterest(sac2.getBalance()));

        CurrentAccount cac = new CurrentAccount("KotackMahindraBank","km0000937883","Ajay",200000);
        System.out.println("Current Balance: Rs. " + cac.getBalance());
        System.out.println("======================================");
        cac.deposit(160000);
        System.out.println("======================================");
        cac.withdraw(95000);
        System.out.println("======================================");
        System.out.println(sac.toString());
        System.out.println(sac2.toString());
        System.out.println(cac.toString());
    }
}
