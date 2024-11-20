package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button/*[local-name()='svg']")).click();

	}

}
