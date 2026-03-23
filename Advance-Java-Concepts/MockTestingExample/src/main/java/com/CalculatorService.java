package com;

public class CalculatorService {
	private ICalculator cal;
	
//	public CalculatorService() {
//		
//	}

	public CalculatorService(ICalculator cal) {
		super();
		this.cal = cal;
	}
	
	public int addService(int x,int y) {
		return cal.calculate(x,y);
	}

}
