package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String parentWindow = driver.getWindowHandle();
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);
		System.out.println("New Window title: " + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println("Back to: " + driver.getCurrentUrl());
		
		driver.quit();

	}

}
