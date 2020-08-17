package Java_Practics;

import java.util.Scanner;

public class OddOREvenNumber {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please Enter any number");
	int number = sc.nextInt();
	if(number%2==0) {
		System.out.println("Entered number is even");
	}
	else {
		System.out.println("Entered number is odd");
	}
	}

}
