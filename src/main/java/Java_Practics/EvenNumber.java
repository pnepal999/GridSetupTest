package Java_Practics;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number in console");
	    int number =  sc.nextInt();
		if(number%2==0){
			System.out.println(number + ": is Even");
		}
		else {
			System.out.println(number +" is odd ");
		}
	}

}
