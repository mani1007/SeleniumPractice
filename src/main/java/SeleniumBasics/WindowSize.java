package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
//		Dimension dim = new Dimension(430, 962);
//		driver.manage().window().setSize(dim);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		driver.manage().window().minimize();
//		Thread.sleep(2000);
//		driver.manage().window().maximize();

		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		System.out.println("Font Size of First name: " + firstName.getCssValue("font-size"));
		
		int height = driver.manage().window().getSize().height;
		int width = driver.manage().window().getSize().width;
		
		System.out.println("Window Height: "+ height + " " + "Window Weight: " + width);
		
		int eleHeight = firstName.getSize().getHeight();
		int eleWidth = firstName.getSize().getWidth();
		
		System.out.println("Element Height: "+ eleHeight + " " + "Element Weight: " + eleWidth);
		
		int xPos = firstName.getLocation().getX();
		int yPos = firstName.getLocation().getY();
		
		System.out.println("Element XPosition: "+ xPos + " " + "Element YPosition: " + yPos);
		
		
	}

}
