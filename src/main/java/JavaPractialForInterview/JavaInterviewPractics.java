package JavaPractialForInterview;

import java.util.HashSet;
import java.util.Set;

public class JavaInterviewPractics {

	public static void main(String[] args) {

		//1. how to you reverse String

		String st = "Selenium";  //Strings are immutable in java

		//using String buffer

		StringBuffer sb = new StringBuffer(st);
		System.out.println(sb.reverse());

		// using for loop
		int len = st.length();
		String rec = "";

		for(int i =len-1; i>=0;i--) {
			rec = rec+ st.charAt(i);

		}
		System.out.println(rec);

		//2. How will you remove unwanted character from string or
		// we will use regular expression [^A-Za-z0-9]

		String st1 = "#$@!%*HiJavaILOVEYOU*&^%$";

		String s = st1.replaceAll("[^A-Za-z0-9]","");


		System.out.println(s);

		//3. How do we reverse integer

		int age = 35;

		String st2 = Integer.toString(age);

		StringBuffer sb1 = new StringBuffer(st2);
		System.out.println(sb1.reverse());

		//4. missing number in array

		int a[] = {1,2,3,5,6,7,8,9};

		int sum =0;


		for(int i =0;i < a.length;i++) {
			sum = sum+ a[i];

		}
		System.out.println("sum:"+sum);

		int  sum1=0;

		for(int j = 1 ; j<=9 ; j++) {
			sum1= sum1+ j;
			//System.out.println(sum1);

		}
		System.out.println("Sum1:"+sum1);

		int missingnum = sum1-sum;
		System.out.println("Missing Number:"+ missingnum );

		//5. How to find duplicate value in java

		String names[] = {"java","python", "javaScript","ruby","java"};

		Set<String> store = new HashSet<String>();
		for(String name:names) {

			if(store.add(name)== false) {
				System.out.println("Duplicate num :"+ name);
				System.out.println(store);
			}


		}

		//6.How to find largets num and smallest num from  given integer array

		int numArray[] = {23,25,36,22,21,15};

		int largnum = numArray[0];

		int smallnum = numArray[0];

		//if(int i=1;i<= numArray.length; i++) {

		System.out.println("*********String manupulation **********");

		//7.  String Manupulation 
		String str = "The rains have stared here also";
		String str1 = "The rains have stared Here also";

		System.out.println("Lenth of string: "+str.length());
		//what is the chatater is in fifth index
		System.out.println("Char value in fifth index: "+str.charAt(5));
		//find the index of s
		System.out.println("Index of s: "+str.indexOf('s')); // First occurance of S
		//find the index of second s
		System.out.println("second s index :"+ str.indexOf('s',str.indexOf('s')+1)); // Second occurance of S

		System.out.println("Index of third S:"+ str.indexOf('s', str.indexOf('s',str.indexOf('s')+1)+1));//Third occurance of s

		//index of string
		System.out.println(str.indexOf("have"));
		// index of string which is not present 
		System.out.println(str.indexOf("hello"));

		//String comparisation
		System.out.println("String comparisation");
		if(str.equals(str1)) {
			System.out.println("String are equal");
		}
		else {
			System.out.println("String are not equal");
		}

		// System.out.println(str.equalsIgnoreCase(str1));

		if(str.equalsIgnoreCase(str1)) {
			System.out.println("String are equal");
		}

		else {
			System.out.println("String are not equal");

		}

		//featching substring from big string like rains from above string

		System.out.println(str.substring(4, 9));

		//triming
		String str2 = "       There is a lion  ";
		System.out.println("Before trim:"+str2);
		System.out.println(" After trim :"+ str2.trim());

		String date = "01-23-1980"; //01/23/1980
		System.out.println(date.replace("-", "/"));


		//Split in String which will give an array

		String s1 = "Hello_World_Selenium_ Java";
		String sp[] = s1.split("_");

		// System.out.println("After using split :"+ sp);
		for(int i =0; i<sp.length; i++) {
			System.out.println(sp[i]);



		}

		String s5 = "Selenium";

		System.out.println(s5.concat("Interview"));
		System.out.println(s5);


		//How to swap between two integer variables without using third variable 

		int x = 5;
		int y = 10;

		x = x+y; //25
		y = x-y; //10
		x = x-y; //5

		System.out.println("value of x :"+ x);
		System.out.println("Value of y :" + y);


		// using thrid variable

		int p = 10;
		int q = 20;

		int t;
		t = p; //5
		p = q;//10
		q = t; //5

		System.out.println("Value of a :"+ p);
		System.out.println("Value of b :"+ q);


		
			 
		 
		 
		
	
		
		
	}
}









