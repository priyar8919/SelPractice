package basicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Desktopp\\Selenium\\libs\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get( "https://qfinancialintplanner.aaps.deloitte.com/");
		
		
	}

}
