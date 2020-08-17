package Java_Practics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateAndTIme {

	public static void main(String[] args) {
		
		//local date and time
		Date currentdate = new Date();
		System.out.println(currentdate);
		SimpleDateFormat timeformate = new SimpleDateFormat("hh:mm:ss");
		SimpleDateFormat dateformate = new SimpleDateFormat("MM:dd:yyyy");
		
		String ctime =timeformate.format(currentdate);
		String cdate = dateformate.format(currentdate);
		System.out.println(ctime);
		System.out.println(cdate);
		

	}

}
