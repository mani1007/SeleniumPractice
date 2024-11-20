package SeleniumBasics;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window: "+ parentWindow);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href, 'twitter')]")).click();//child
		
		if(waitUntilWindow(2,5))
		{
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			
			while(it.hasNext())
			{
				String windowId = it.next();
				if(parentWindow.equals(windowId))
					System.out.println("Parent Window Id: "+ windowId);
				else
					System.out.println("Child Window Id: "+ windowId);
						
			}
		}

	}
	
	public static boolean waitUntilWindow(int totalWindows, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindows));
	}

}
