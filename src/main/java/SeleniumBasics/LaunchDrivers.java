package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchDrivers {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		String title = driver.getTitle();
		System.out.println("Page Title: " + title);

		driver.close();
		
		//driver.quit();

		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com");

		String title1 = driver1.getTitle();
		System.out.println("Page Title1: " + title1);
		
		driver1.close();

	}

}
