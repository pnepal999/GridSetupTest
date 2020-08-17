package JavaPracticeFlow2;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UseofHashMapInSelenium {

	public static void main(String[] args) {

		//WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rupa Acharya\\eclipse-workspace\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		System.out.println(getCredintialMap());
		
		driver.findElement(By.id("email")).sendKeys(getUserName("admin"));
		driver.findElement(By.id("passwd")).sendKeys(getPassword("admin"));

		// System.out.println(getCredintialMap());


	}

	public static HashMap getCredintialMap(){
		HashMap<String, String> userMap = new HashMap<>();
		userMap.put("customer","test321@example.com:testing");
		userMap.put("admin", "arpat123:password1");
		userMap.put("distbuter", "tom123:cat@321");
		userMap.put("delivery", "ups@32:united001");

		return userMap;

	}

	public static String getUserName(String role) {

		String credintial = (String) getCredintialMap().get(role); 
		return credintial.split(":")[0];

	}
	public static  String getPassword(String role) {

		String credintial = (String) getCredintialMap().get(role); 
		return credintial.split(":")[1];
	}
}
