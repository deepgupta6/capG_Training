package interestCalculator;

public abstract class Account {
	private double interestRate;
	private double amount;
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public abstract double calculateInterest();
}
