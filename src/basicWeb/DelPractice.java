package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelPractice {
public static void main(String[] args) {
		//set properties in environment variables
		//System.setProperty("webdriver.chrome.driver", "D:\\Desktopp\\Selenium\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get( "https://qfinancialintplanner.aaps.deloitte.com/");
		
		
	}

}
