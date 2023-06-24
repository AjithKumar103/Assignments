package inheritance.bank;

public class IDFCInterest extends InterestCalculator{
    public double calculateInterest(double balance){
        final double annualInterest = 4.0;
        return (balance * annualInterest/100) / 365;
    }
}
