package JavaPractialForInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mapeInterface {

	public static void main(String[] args) {

		//HasMap
		
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(2, "Java");
		hmap.put(6, "JavaScritp");
		hmap.put(1, "Python");
		hmap.put(5, "Rubi");
		hmap.put(2,"C++");
		hmap.put(0, "Sprint");
		hmap.put(12, "Python");
		System.out.println(hmap);
		System.out.println(hmap.get(2));
		System.out.println(hmap.get(100));
		//If you want to print one by one to all element then use for loop or this is how we need to iterate hashmap
		System.out.println("*****************");
		hmap.remove(5);
		for(Entry<Integer, String> m : hmap.entrySet() ) {
			System.out.println(m.getKey() + " " + m.getValue());
			
		}
// How to iterate class object in hashmap
		System.out.println("*************");
		HashMap< Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Tom", 23,"Dev");
		Employee e2 = new Employee("Rahul", 25,"QA");
		Employee e3 = new Employee("Dinesh", 39,"Banker");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		// Trave the Hashmap
		for(Entry<Integer, Employee> m: emp.entrySet()) {
			int key = m.getKey();
			Employee e4 = m.getValue();
			//String em =m.getValue();
			
		System.out.println("Employee "+ key +" Info :");
		System.out.println(e4.name+" "+ e4.age +" "+e4.dept);
		}
		
		
		
		
		
		
	}

}
