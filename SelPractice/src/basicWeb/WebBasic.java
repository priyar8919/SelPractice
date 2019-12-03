package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBasic {

	public static void main(String[] args) {
		// http://chromedriver.storage.googleapis.com/index.html
		String baseURL = "http://www.google.com";
		System.setProperty("webdriver.chrome.driver", "D:\\Desktopp\\Selenium\\libs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		driver.quit();
		

	}

}