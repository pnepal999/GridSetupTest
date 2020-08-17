package JavaPractialForInterview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class JavaInterviewQuestion {

	public static void main(String[] args) {
		//1. how to you reverse String 
		// Using for loop
		
		String s = "Selenium";//8
		
		int len = s.length();
		String rec = "";
		
		for(int i = len-1; i>=0; i--) {
			 rec = rec + s.charAt(i);
		}
		System.out.println(rec);
		
		//Using string buffer class we can reverse interger
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		
		System.out.println("**********removing unwanted stuff from string ***************");
		//2. How will you remove unwanted character from string or 
		//Ans: we need to use regular expression [^a-zA-Z0-9]
		
		String s1 = "*&^%$# This is Parshuram 25368 ****&&&&";
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
		//3. How do we reverse integer
		System.out.println("**********reverse Integer******************");
		int num = 32546;
		
		int rem = 0;
		int rev = 0;
		while(num !=0) {
			
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num/10;
		}
		System.out.println(rev);
		
		System.out.println("*****************using string buffer****************");
		 int num1 = 32564;
		 
		 System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		 
		System.out.println("**********find missing number in Array*************");
		
		//4. missing number in array
		
		int a[] = {1,2,3,5,6,7};
		
		int sum = 0;
		for(int i =0; i<a.length;i++) {
			sum = sum + a[i];
			
			
		}
		System.out.println(sum);
		
		int sum1 =0;
		for(int j=1;j<=7;j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		System.out.println("Missing Number :"+ (sum1-sum));
		
		//5. How to find duplicate value in java
		//Using HasSet java collection
		System.out.println("*******Duplicate value*********");
		
		String lan[]= { "Java","Python","JavaScript", "Rubi","Java"};
		
		Set<String> names = new HashSet<String>();
		for(String name:lan) {
			if (names.add(name)==false) {
				System.out.println("Duplicate value is : "+ name);
			}
		}
		
		
		System.out.println("***********Iterating Arraylist differet list *****************");
		
		ArrayList<String> movies = new ArrayList<String>();
		movies.add("The Last Stand");
		movies.add("Land of Heroes");
		movies.add("The Wall");
		movies.add("Mission impossible");
		movies.add("Capitan America");
		
		//1. Using for each loop  lamda exprtess
		movies.forEach(shows  -> {
			System.out.println(shows);
		});
		System.out.println("**********");
		
		//2.using Iterate
		Iterator<String> it = movies.iterator();
		while(it.hasNext()) {
			String filim = it.next();
			System.out.println(filim);
		}
		
		//3. Using for each loop
		System.out.println("******using for loop*******");
		for( String filim: movies) {
			System.out.println(filim);
			
		}
		
		//6. How to find even or Odd number 
		
		/*
		 * System.out.println("*****odd or even nubmer****");
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Please enter any number"); int number = sc.nextInt();
		 * if(number%2==0) { System.out.println("Even Number");
		 * 
		 * } else { System.out.println("Odd number"); }
		 * System.out.println("********print matrix***********");
		 */
		//7. how to print 4X4 matrix for interger
	
	for(int i=0;i<=3;i++) {
		for(int j=0;j<=3;j++) {
			System.out.print(i+""+j+" ");
		}
		System.out.println();
	}
	
	}

}
