package interestCalculator;

public class SBAccount extends Account{
	private double interestRate;
	private double amount;
	
	public SBAccount(double amount) throws InvalidInputException{
		
		if (amount < 0) {
	        throw new InvalidInputException("Amount cannot be negative");
	    }
		
		this.amount = amount;
		this.interestRate = 4;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public double getAmount() {
		return amount;
	}
	
	@Override
	public double calculateInterest() {
		return (amount/100)*interestRate;
		
	}

}
