package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollingTimeConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		
		By twitterBy = By.xpath("//a[contains(@href, 'twitter1')]");
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5), Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(twitterBy)).click();

		//For Additional Knowledge
		//If you give interval time greater than wait time as mentioned below,
		//It will give you exception if the element is not available at the first attempt.
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2), Duration.ofSeconds(5));
	}

}
