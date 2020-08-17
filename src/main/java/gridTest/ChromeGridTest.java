package gridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		
		//1. define desired capabilites
		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setBrowserName("chrome");
		dcap.setPlatform(Platform.WINDOWS);
       //2.chrome options definitions
		ChromeOptions option = new ChromeOptions();
		option.merge(dcap);
		
		String hubUrl = "http://localhost:4445/wd/hub";
		//3. initilation of webdriver
		
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),dcap);
		
		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
