package Java_Practics;

import java.util.Scanner;

public class UserInputFromScannerClass {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your Name");
	String name = sc.next();
	System.out.println("please enter your age");
	int age = sc.nextInt();
	System.out.println("Please enter your genter");
	 char gender = sc.next().charAt(0);
	 System.out.println("Please enter your ph number");
	Long phnumber =  sc.nextLong();
	System.out.println("Name:"+ name + ",Age:" + age+ ",Gender:"+ gender +",Ph number:"+ phnumber);
	

	}

}
