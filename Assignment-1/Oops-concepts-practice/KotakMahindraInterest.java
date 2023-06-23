package inheritance.bank;

public class KotakMahindraInterest implements InterestCalculator{
    public double calculateInterest(double balance){
        final double annualInterest = 3.50;
        return (balance * annualInterest/100) / 365;
    }
}
