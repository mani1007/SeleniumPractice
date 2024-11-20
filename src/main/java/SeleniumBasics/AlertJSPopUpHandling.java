package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopUpHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1. Handling Normal/Basic Alert JS Popup
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		Alert alert = driver.switchTo().alert();
//		
//		alert.accept();
		
		
		//2. handling Confirmation JS Popup
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		
//		//alert.accept();
//		
//		alert.dismiss();
		
		
		//3. Handling Prompt JS Popup
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.sendKeys("Automation");
		
		alert.accept();
		

	}

}
