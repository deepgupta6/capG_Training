package com;

public class CalculatorMain {

	public static void main(String[] args) {
		ICalculator c = (i,j)->i+j;
		CalculatorService cS = new CalculatorService(c);
		
		System.out.println(cS.addService(10, 5));

	}

}
