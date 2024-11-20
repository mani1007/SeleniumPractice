package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandlingOneByOne {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String parentWindow = driver.getWindowHandle();
		
		WebElement linkedinElement = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement facebookElement = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement twitterElement = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement youtubeElement = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		
		handleChildWindow(parentWindow, linkedinElement);
		System.out.println("Back to: "+ driver.getCurrentUrl());
		
		handleChildWindow(parentWindow, facebookElement);
		System.out.println("Back to: "+ driver.getCurrentUrl());
		
		handleChildWindow(parentWindow, twitterElement);
		System.out.println("Back to: "+ driver.getCurrentUrl());
		
		handleChildWindow(parentWindow, youtubeElement);
		System.out.println("Back to: "+ driver.getCurrentUrl());
		
		driver.quit();
		
	}
	
	public static void handleChildWindow(String parentWindow, WebElement childWindowElement) throws InterruptedException
	{
		childWindowElement.click();
		Thread.sleep(3000);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext())
		{
			String windowId = it.next();
			if(!windowId.equals(parentWindow))
			{
				System.out.println("Child Window Id: "+ windowId);
				driver.switchTo().window(windowId);
				System.out.println("Child Window URL: "+driver.getCurrentUrl());
				driver.close();
			}			
		}
		driver.switchTo().window(parentWindow);		
	}

}
