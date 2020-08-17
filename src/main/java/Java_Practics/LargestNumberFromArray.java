package Java_Practics;

public class LargestNumberFromArray {

	public static void main(String[] args) {
		// write the the programm that will fine max number fron unsorted array
		
		int age[] = {11,15,26,54,2,88,45,21,23,32};
		
		int largest = age[0];
		int smellest = age[0];
		
		for(int i=1; i<age.length;i++) {
			if(age[i]> largest) {
				largest = age[i];
				}
			else if(age[i]<smellest) {
				smellest = age[i];
				}
		}
		System.out.println(largest);
		System.out.println(smellest);

		
		//
	}

}
