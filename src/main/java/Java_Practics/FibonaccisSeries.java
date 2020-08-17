package Java_Practics;

import java.util.Scanner;

public class FibonaccisSeries {

	public static void main(String[] args) {
		// febonaccis series is sum of previous two numbers like 0,1,1,2,3,5,8......n
	//1. using for loop	
		/*
		 int a=0,b=1;
		System.out.println(a+ " "+ b);
		int c;
		for(int i=1; i<=20;i++) {
			c=a+b;
			
			System.out.println(" "+ c);
			a=b;
			b=c;
		}
		
		*/
		
		
		
		//2. using scanner with for loop
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please inter num");
		num = sc.nextInt();
		int f,f1=0,f2=1;
		
		for(int i=1;i<=num;i++) {
			f=f1+f2;
			System.out.println(f);
		
			f1=f2;
			f2=f;
	
			
		}
			
		
		
		

	}

}
