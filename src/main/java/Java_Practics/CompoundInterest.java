package Java_Practics;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		double Principle_amount;
		double interest_rate;
		double time_period;
		double compound_interest;
		double total_amt;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please inter principle amount ");
		Principle_amount = sc.nextDouble();
		System.out.println("Please inter intrest rate");
		interest_rate = sc.nextDouble();
		System.out.println("Please inter time period");
		time_period = sc.nextDouble();
		
		
		total_amt = Principle_amount * Math.pow((1 +interest_rate/100) , time_period);
		compound_interest = total_amt - Principle_amount;
		
System.out.println("Total amount is :" + total_amt);
System.out.println("Compound interest is :" + compound_interest);
	}

}
