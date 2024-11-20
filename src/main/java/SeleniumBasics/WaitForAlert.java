package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		String alertText = getJSAlertText(5);
//		System.out.println(alertText);
//		
//		acceptAlert(5);
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		
//		String alertText = getJSAlertText(5);
//		System.out.println(alertText);
//		
//		//acceptAlert(5);
//		dismissAlert(5);
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		String alertText = getJSAlertText(5);
		System.out.println(alertText);
		
		alertSendKeys(5, "Automation");
		
		acceptAlert(5);
		//dismissAlert(5);

	}
	
	public static Alert waitForJSAlert(int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static String getJSAlertText(int timeout)
	{
		return waitForJSAlert(timeout).getText();
	}
	
	public static void acceptAlert(int timeout)
	{
		waitForJSAlert(timeout).accept();
	}
	
	public static void dismissAlert(int timeout)
	{
		waitForJSAlert(timeout).dismiss();
	}
	
	public static void alertSendKeys(int timeout, String input)
	{
		waitForJSAlert(timeout).sendKeys(input);
	}

}
