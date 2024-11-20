package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//Wait(I) : until(); --> FluentWait(C): (@overriden)until(){} + other methods --> WebDriverWait (C): no methods
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		By fullName = By.id("Form_getForm_Name");
		By email = By.id("Form_getForm_Email");
		
		WaitUntilElementPresence(fullName,10).sendKeys("Automation");
		WaitUntilElementVisibility(email,10).sendKeys("test123@nal.com");
		//getElement(email).sendKeys("test123@nal.com");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement fullNameElement = wait.until(ExpectedConditions.presenceOfElementLocated(fullName));
//		fullNameElement.sendKeys("Automation");
	

	}
	
	/**
	   * An expectation for checking that an element is present on the DOM of a page. This does not
	   * necessarily mean that the element is visible.
	   *
	   * @param locator used to find the element
	   * @return the WebElement once it is located
	   */
	public static WebElement WaitUntilElementPresence(By locator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	   * An expectation for checking that an element is present on the DOM of a page and visible.
	   * Visibility means that the element is not only displayed but also has a height and width that is
	   * greater than 0.
	   *
	   * @param locator used to find the element
	   * @return the WebElement once it is located and visible
	   */
	
	public static WebElement WaitUntilElementVisibility(By locator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

}
