package JavaPractialForInterview;

public class JavaInterviewPctise2  {

	public static void main(String[] args) {
		
		// How to swap two String without using third variable
			String a = "Hello";
			String b = "World";
            
	// concat or append a and b
			 a = a+b; //Hello

			
			 b= a.substring(0,a.length()-b.length()); // Hello
			 
			 a = a.substring(b.length());  // World
			 
			 
			System.out.println("After swap ");
	
			 System.out.println("Value of a: "+a);
			 System.out.println("Value of b: "+b);
				

			  String str = "SeleniumAutomation";
			 System.out.println( str.substring(2, 5));
			  System.out.println(str.substring(0, 7));
			  System.out.println(str.substring(8));
			
			
			  
	}

}
