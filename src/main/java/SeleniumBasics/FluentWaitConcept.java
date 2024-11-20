package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {

	public static void main(String[] args) {

		//Wait(I) : until(); --> FluentWait(C): until(){} + other methods --> WebDriverWait (C)

		WebDriver driver = new ChromeDriver();//browser - chrome

		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
				
		By image = By.cssSelector("div#imageTemplateContainer img");
		
		//1. Fluent Wait with reference of FluentWait Class
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class)
				.ignoring(ElementNotInteractableException.class)
				.withMessage("TimeOut - Element Not Present");
		
		//1a. Fluent Wait with reference of FluentWait Class
				FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
						.withTimeout(Duration.ofSeconds(5))
						.pollingEvery(Duration.ofSeconds(1))
						.ignoring(NoAlertPresentException.class)
						.withMessage("TimeOut - Alert Not Present");
		
		
		//2. Fluent Wait with reference of Wait Interface(Parent of FluentWait Class)
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(5))
//				.pollingEvery(Duration.ofSeconds(1))
//				.ignoring(NoSuchElementException.class)
//				.withMessage("TimeOut - Element Not Present");		
		
		//3. webDriverWait with Fluent Wait Features
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//				wait.pollingEvery(Duration.ofSeconds(1))
//				.ignoring(NoSuchElementException.class)
//				.withMessage("TimeOut - Element Not Present");	
				
		//4. WebDriverWait with reference of Wait Interface(GrandParent of WebDriverWait Class)
//		Wait wait = new WebDriverWait(driver, Duration.ofSeconds(5))
//						.pollingEvery(Duration.ofSeconds(1))
//						.ignoring(NoSuchElementException.class)
//						.withMessage("TimeOut - Element Not Present");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(image)).click();
		
		
				

	}

}
