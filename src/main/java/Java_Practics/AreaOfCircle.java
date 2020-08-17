package Java_Practics;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int radious;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the readious value");
		
		radious= sc.nextInt();
		//user Math.PI to get the vlaue of PI
		
		double area = Math.PI * radious * radious;
		
		System.out.println("Area of Circle :"+ area);
		
	}

}
