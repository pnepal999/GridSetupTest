package Java_Practics;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Generate5Integgers {

	public static void main(String[] args) {
		// How to generate 5 randome integer number from 1 to 50
		
		//int number;
		
	//	1. method
		 for(int a=1; a<=5; a++) {
		  System.out.println((int)(Math.random()*50)); }
		 
		 System.out.println("********************");
		 //second method using linkedhasset
		 
		Random rnd = new Random();
		Set<Integer> set = new LinkedHashSet<>();
		while(set.size() != 5)
		    set.add(rnd.nextInt(49) + 1);
		System.out.println(set);
		
		// how to print one randmo number out of 50
		int random_int = rnd.nextInt(51);
		System.out.println("One random integer is :"+ random_int);
		
		System.out.println("--------------------");
		System.out.println("Ramdon number is "+ Math.random());
		
		
	}

}
