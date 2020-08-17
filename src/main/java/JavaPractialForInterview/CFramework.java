package JavaPractialForInterview;

import java.util.HashSet;
import java.util.Set;

public class CFramework {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<String>();
		
		hs.add("Nepal");
		hs.add("India");
		hs.add("Bhutan");
		hs.add("Nepal");
	
		
		System.out.println(hs);
	hs.remove("India");
		System.out.println(hs);
		
		 
	}

}
