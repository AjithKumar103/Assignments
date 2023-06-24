package inheritance.bank;

public class SBIInterest extends InterestCalculator{
    @Override
    public double calculateInterest(double balance) {
        final double annualInterest = 2.70;
        return (balance * annualInterest/100) / 365;
    }
}
