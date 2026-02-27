package interestCalculator;

import java.util.Scanner;

public class InterestCalculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("Select the option:");
			System.out.println("1. Interest Calculator -SB");
			System.out.println("2. Interest Calculator -FD");
			System.out.println("3. Interest Calculator -RD");
			System.out.println("4. Exit");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				try {
					System.out.println("Enter the Average amount in your account:");
					double amount = sc.nextDouble();
					
					SBAccount sb = new SBAccount(amount);
					
					System.out.println(sb.calculateInterest());
				}catch (InvalidInputException e) {
			        System.out.println("Error: " + e.getMessage());
			    }
				break;
			case 2:
				try {
					System.out.println("Enter the FD amount:");
					double amount = sc.nextDouble();
					System.out.println("Enter the number of days:");
					int noOfDays = sc.nextInt();
					System.out.println("Enter your age:");
					int ageofACHolder = sc.nextInt();
					
					FDAccount fd = new FDAccount(amount,noOfDays,ageofACHolder);
					
					System.out.println(fd.calculateInterest());
				}catch (InvalidInputException e) {
			        System.out.println("Error: " + e.getMessage());
			    }
				break;
			case 3:
				try {
					System.out.println("Enter age:");
					int ageofACHolder = sc.nextInt();
					System.out.println("Enter the number of months:");
					int noOfMonths = sc.nextInt();
					System.out.println("Enter your monthly installement:");
					double monthlyAmount = sc.nextDouble();
					
					RDAccount rd = new RDAccount(ageofACHolder,noOfMonths,monthlyAmount);
					
					System.out.println(rd.calculateInterest());
				} catch (InvalidInputException e) {
			        System.out.println("Error: " + e.getMessage());
			    }
				break;
			case 4:
				System.out.println("Exiting...");
				sc.close();
				System.exit(0);
				
				
			}
		}
	}

}
