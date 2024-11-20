package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleElementRefExceptionConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By byEmail = By.id("input-email");
		
		WebElement emailId = driver.findElement(byEmail);
		emailId.sendKeys("naveen@gmail.com");
		
		TimeUtil.mediumTime();

		driver.navigate().refresh();// back and forward

		//1. Reinitialize the element
		//emailId = driver.findElement(byEmail);
		//emailId.sendKeys("tom@gmail.com");// selenium.StaleElementReferenceException:
		// stale element reference: stale
		// element not found
		
		//2. Handle Stale Element using fluent Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMillis(500)).ignoring(StaleElementReferenceException.class)
				.withMessage("element not found...");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(byEmail)).sendKeys("tom@gmail.com");

	}

}
