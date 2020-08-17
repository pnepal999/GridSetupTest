package Java_Practics;

import java.util.Scanner;

public class FindBiggestFromThreeNumber {

	public static void main(String[] args) {
		// how to find biggest of 3 numbers in java ?
		
		//Ans: first we have to create user input with the help of scanner object 
		
		int a,b,c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inter the value of first number");
		 a = scanner.nextInt();
		 System.out.println("Inter the value of second number");
		 b = scanner.nextInt();
		 System.out.println("Inter the value of third number");
		 c = scanner.nextInt();
		 
		 if(a>b && b>c) {
			 System.out.println("a is the big number");
			 
		 }
		 else if (b>c) {
			 System.out.println("b is the big number");
		 }
		 else {
			 System.out.println("c is the big number");
		 }

}
}