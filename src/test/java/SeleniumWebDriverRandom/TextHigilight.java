package SeleniumWebDriverRandom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextHigilight {

	public static void main(String[] args) {
		
		//bDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupa Acharya\\eclipse-workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		//driver.findElement(By.id("email")).sendKeys("test321@example.com");
		//driver.findElement(By.id("passwd")).sendKeys("testing");
		WebElement lonin = driver.findElement(By.xpath("//span[contains(.,'Create an account')]"));
		flash(lonin, driver);
		
		
	}
	public static void flash(WebElement element,WebDriver driver) {
	JavascriptExecutor je =((JavascriptExecutor)driver);
	String bgcolor = element.getCssValue("backgroundColour");
	
	for(int i= 1;i<50;i++) {
		changeColor("rgb(0,200,0)", element,driver);
		changeColor(bgcolor, element, driver);
		
	}
	}
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("argumetns[0].style.backgroundColour = '" + color +"'"+ element);
		
		try {
			Thread.sleep(20);
		}
		catch(Exception e){
			
		}
	}
		
	


	
		
	}
