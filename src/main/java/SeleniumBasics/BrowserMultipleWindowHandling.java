package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext())
		{
			String windowId = it.next();
			System.out.println("Window Id: "+ windowId);
			driver.switchTo().window(windowId);
			System.out.println("Window URL: "+driver.getCurrentUrl());
			
			if(!windowId.equals(parentWindow))
			{
				driver.close();
			}			
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle()+" "+driver.getCurrentUrl());
		
		driver.quit();

	}

}
