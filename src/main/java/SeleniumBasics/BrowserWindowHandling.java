package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentWindow = it.next();
		System.out.println("Parent Window: "+ parentWindow);
		
		String childWindow = it.next();
		System.out.println("Child Window: "+ childWindow);
		Thread.sleep(3000);		
		
		driver.switchTo().window(childWindow);
		System.out.println("Child URL: " + driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.close();
		Thread.sleep(3000);
		
		driver.switchTo().window(parentWindow);
		System.out.println("Parent URL: " + driver.getCurrentUrl());
		
		driver.quit();
		
	}

}
