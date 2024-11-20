package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
				driver.get("https://naveenautomationlabs.com/opencart/");
				
				String title = driver.getTitle();
				System.out.println("Page Title: "+ title);
				
				if(title.equals("Your Store"))
				{
					System.out.println("Title Correct");
				}
				else
				{
					System.out.println("Wrong Title");
				}
				
				
				if(driver.getCurrentUrl().contains("naveenautomationlabs.com"))
				{
					System.out.println("URL Correct");
				}
				else
				{
					System.out.println("Wrong URL");
				}
				
				driver.close();

	}

}
