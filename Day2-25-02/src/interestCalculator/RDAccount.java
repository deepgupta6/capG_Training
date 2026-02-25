package interestCalculator;

public class RDAccount extends Account{
	private double interestRate;
	private double amount;
	private int noOfMonths;
	private double monthlyAmount;
	private int age;
	private double[][] iRCal = {
			{0,0,0},
			{6,7.5,8},
			{9,7.75,8.25},
			{12,8.0,8.5},
			{15,8.25,8.75},
			{18,8.50,9.0},
			{21,8.75,9.25},
	};
	
	public RDAccount(int age,int nom,double mA) throws InvalidInputException{
		if (mA < 0) {
	        throw new InvalidInputException("Monthly installement cannot be negative");
	    }
	    if (nom < 0) {
	        throw new InvalidInputException("Number of months cannot be negative");
	    }
	    if (age < 0) {
	        throw new InvalidInputException("Age cannot be negative");
	    }
		this.amount = mA*nom;
		this.noOfMonths = nom;
		this.monthlyAmount = mA;
		this.interestRate = 0;
		this.age = age;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public int getNoOfMonths() {
		return noOfMonths;
	}
	
	public double getMonthlyAmount() {
		return monthlyAmount;
	}
	
	@Override
	public double calculateInterest() {
		for(int i=0;i<iRCal.length;i++) {
			if(this.noOfMonths<=iRCal[i][0]) {
				if(this.age>=60) {
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
