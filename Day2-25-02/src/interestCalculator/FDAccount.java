package interestCalculator;

//import java.util.function.Predicate;

public class FDAccount extends Account{
	private double interestRate;
	private double amount;
	private int noOfDays;
	private int ageofACHolder;
	private double[][] iRCal = {
			{6,0,0},
			{14,4.50,5},
			{29,4.75,5.25},
			{45,5.50,6},
			{60,7,7.5},
			{184,7.50,8},
			{365,8,8.50},
	};
	
	public FDAccount(double amount, int nod,int age) throws InvalidInputException{
		
		if (amount < 0) {
	        throw new InvalidInputException("Amount cannot be negative");
	    }
	    if (nod < 0) {
	        throw new InvalidInputException("Number of days cannot be negative");
	    }
	    if (age < 0) {
	        throw new InvalidInputException("Age cannot be negative");
	    }
	    
		this.amount = amount;
		this.ageofACHolder = age;
		this.noOfDays = nod;
		this.interestRate =0;
		
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public int getNoOfDays() {
		return noOfDays;
	}
	
	public int getAgeofACHolder() {
		return ageofACHolder;
	}
	
	@Override
	public double calculateInterest() {
		for(int i=0;i<iRCal.length;i++) {
			if(this.noOfDays<=iRCal[i][0]) {
				if(this.ageofACHolder>=60) {
					this.interestRate = iRCal[i][2];
				} else {
					this.interestRate = iRCal[i][1];
				}
				break;
			}
		}
		return (amount/100)*this.interestRate;
	}
}
